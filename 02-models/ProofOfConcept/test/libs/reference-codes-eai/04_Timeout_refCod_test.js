// test ./test/libs/reference-codes-eai/04_Timeout_refCod_test.js

// startTime: 1670530986
// timeout: 50 seconds
// endTime:  1670531036
const expect = require("chai").expect;
const timeout_refCod = artifacts.require("Timeout_refCod");

contract("Timeout_refCod", (accounts) => {
  let t_instance;
  beforeEach(async () => {
    // to_instance = await timeout_refCod.deployed();
    t_instance = await timeout_refCod.deployed();
  });

  it("constructor", async () => {
    let timeouts = await t_instance.getAllTimeouts.call();
    expect(timeouts).to.be.an("array").length(2);
    expect(+timeouts[0].endTime).to.equal(0);
    expect(+timeouts[0].timeIncrement).to.equal(50);
    expect(+timeouts[1].endTime).to.equal(0);
    expect(+timeouts[1].timeIncrement).to.equal(30);
  });

  it("getOneTimeOut", async () => {
    let timeout = await t_instance.getOneTimeout.call(0);
    expect(+timeout.endTime).to.equal(0);
    expect(+timeout.timeIncrement).to.equal(50);
  });

  it("setTimoutEnd", async () => {
    await t_instance.setTimeoutEnd(0, 600);
    let timeout = await t_instance.getOneTimeout.call(0);
    expect(+timeout.endTime).to.equal(650);
    expect(+timeout.timeIncrement).to.equal(50);
  });

  it("isTimoutEnd", async () => {
    let isOutOfTime = await t_instance.isTimeoutEnded.call(0, 650);
    expect(isOutOfTime).to.be.false;
    isOutOfTime = await t_instance.isTimeoutEnded.call(0, 651);
    expect(isOutOfTime).to.be.true;
  });
});
