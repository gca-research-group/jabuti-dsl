// path to test "./test/libs/reference-codes-eai/Party_refCod_test.js"
const Party_refCod = artifacts.require("Party_refCod");

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
      let result = await party_eai_instance.signContract({
        from: processAddress,
      });
      console.log(result.receipt.status);
      assert.equal(result.receipt.status, false);
    } catch (error) {
      assert.equal(
        error.reason,
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
      const result = await party_eai_instance.signContract({
        from: applicationAddress,
      });
      assert.equal(result.receipt.status, false);
    } catch (error) {
      assert.equal(error.reason, "The contract is already signed");
    }
  });

  it("Exception caught when other party (no process) try to execute the updateParty()", async () => {
    let app2 = await party_eai_instance.getParty.call(applicationAddress);
    try {
      let result = await party_eai_instance.changeApplicationParty(
        "App_2",
        applicationAddress2,
        { from: applicationAddress }
      );
      assert.equal(result.receipt.status, false);
    } catch (error) {
      assert.equal(error.reason, "Only the process can execute this operation");
    }
    // At this time, the aware property has already been set to true in previous tests
    assert.equal(app2.name, "applicationName");
    assert.equal(app2.walletAddress, applicationAddress);
    assert.equal(app2.aware, true);
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
});
