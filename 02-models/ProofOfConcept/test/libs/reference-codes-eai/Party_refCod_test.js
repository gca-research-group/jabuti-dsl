// path to test "./test/libs/reference-codes-eai/Party_refCod_test.js"
const Party_refCod = artifacts.require("Party_refCod");
const expect = require("chai").expect;

contract("Party_refCod", (accounts) => {
  const processAddress = accounts[0];
  const applicationAddress = accounts[1];
  const applicationAddress2 = accounts[2];

  let party_eai_instance;
  beforeEach(async () => {
    party_eai_instance = await Party_refCod.deployed();
  });

  it("The parties were created correctly.", async () => {
    // get the address from the parteis
    let procAddress = await party_eai_instance.getProcessAddress.call();
    let appAddress = await party_eai_instance.getApplicationAddress.call();
    // check if the parties was created correctly
    assert.equal(procAddress, processAddress);
    assert.equal(appAddress, applicationAddress);
  });

  it("The mapParty was created correctly", async () => {
    // get parties from the mapParty
    let mapProcAddress = await party_eai_instance.mapParty.call(processAddress);
    let mapAppAddress = await party_eai_instance.mapParty.call(
      applicationAddress
    );
    assert.equal(mapAppAddress.walletAddress, applicationAddress);
    assert.equal(mapProcAddress.walletAddress, processAddress);
  });

  it("Exception caught when one party (no application) try to sing the contract", async () => {
    try {
      let result = await party_eai_instance.signContract.call({
        from: processAddress,
      });
      assert.equal(result.receipt.status, false);
    } catch (error) {
     let errorReason = getErrorReasonFromCall(error);
      assert.equal(
        errorReason,
        "Only the application can execute this operation"
      );
    }
    let application = await party_eai_instance.getParty.call(
      applicationAddress
    );
    assert.equal(application.aware, false);
  });

  it("Application sign contract", async () => {
    let app = await party_eai_instance.getParty.call(applicationAddress);
    assert.equal(app.aware, false);
    await party_eai_instance.signContract({ from: applicationAddress });
    app = await party_eai_instance.getParty.call(applicationAddress);
    assert.equal(app.aware, true);
  });

  it("Exception caught when try to sign a signed contract", async () => {
    try {
      const result = await party_eai_instance.signContract.call({
        from: applicationAddress,
      });
      assert.equal(result.receipt.status, false);
    } catch (error) {
     let errorReason = getErrorReasonFromCall(error);
      assert.equal(errorReason, "The contract is already signed");
    }
  });


  it("Update party", async () => {
    await party_eai_instance.changeApplicationParty(
      "App_2",
      applicationAddress2
    );
    let app2 = await party_eai_instance.getParty.call(applicationAddress2);
    assert.equal(app2.name, "App_2");
    assert.equal(app2.walletAddress, applicationAddress2);
    assert.equal(app2.aware, false);
  });

  it("Exception caught when other party (no process) try to execute the updateParty()", async () => {
    // The application address was updated in the previous method 
    // In this moment aplication address is the applicationAddress2
    let app2 = await party_eai_instance.getParty.call(applicationAddress2);
    assert.equal(app2.name, "App_2");
    assert.equal(app2.walletAddress, applicationAddress2);
    assert.equal(app2.aware, false);

    /* let app2 = await party_eai_instance.getParty.call(applicationAddress);
    assert.equal(app2.name, "applicationName"); */
    try {
      let result = await party_eai_instance.changeApplicationParty.call(
        "App_2",
        applicationAddress2,
        { from: applicationAddress }
      );
      assert.equal(result.receipt.status, false);
    } catch (error) {
     let errorReason = getErrorReasonFromCall(error);
      assert.equal(errorReason, "Only the process can execute this operation");
    }
    // At this time, the aware property is false because in a previous method it was changed the 
    // application party, then the contract needs to be signed again.
    assert.equal(app2.name, "App_2");
    assert.equal(app2.walletAddress, applicationAddress2);
    assert.equal(app2.aware, false);
  });

});

 function getErrorReasonFromCall(err) {
  let data = err["data"];
  let firstKey = Object.keys(data)[0];
  let error_reason = data[firstKey]["reason"];
  return error_reason;
} 