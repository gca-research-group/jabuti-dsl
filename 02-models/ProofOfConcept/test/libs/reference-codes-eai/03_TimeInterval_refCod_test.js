//test ./test/libs/reference-codes-eai/03_TimeInterval_refCod_test.js

//horas definidas no teste
// 10:00:00 to 14:00:00 -> 36000000,50400000
// 22:00:00 to 02:00:00 -> 79200000, 7200000
// horas para teste
// 01 hr: 3600
// 04 hr: 14400
// 11 hr: 39600
// 13 hr: 46800
// 15 hr: 54000
// 22 hr: 79200
// 23:59:59.999 = (86399999 +1)

const ti_refCod = artifacts.require("TimeInterval_refCod");
const expect = require("chai").expect;

contract("TimeInterval_refCod", (accounts) => {
  let ti_instance;
  beforeEach(async () => {
    // ti_instance = await ti_refCod.deployed();
    ti_instance = await ti_refCod.new();
  });

  it(" TimeIntervals created", async () => {
    let timeIntervals = await ti_instance.getAllTimeInterval.call();
    expect(timeIntervals).to.be.an("array").length(2);
    // assert.equal(timeIntervals.length, 2);
  });

  it("check all time itervals created", async () => {
    let timeIntervals = await ti_instance.getTimeInterval.call(0);
    expect(timeIntervals.start.toNumber()).to.equal(36000);
    // assert.equal(timeIntervals.start, 36000);
    assert.equal(timeIntervals.end, 50400);
    timeIntervals = await ti_instance.getTimeInterval.call(1);
    assert.equal(timeIntervals.start, 79200);
    assert.equal(timeIntervals.end, 7200);
  });

  it("check the isIntoTimeInterval() with a valid an existing hour into the interval", async () => {
    let isIntoTimeInterval = await ti_instance.isIntoTimeInterval.call(39600);
    // console.log(isIntoTimeInterval);
    assert.equal(isIntoTimeInterval, true);
  });

  it("check the isIntoTimeInterval() with a valid but no existent hour into the interval", async () => {
    let isIntoTimeInterval = await ti_instance.isIntoTimeInterval.call(54000);
    // console.log(isIntoTimeInterval);
    assert.equal(isIntoTimeInterval, false);
  });

  it("Check teh isIntoTimeInterval() with a invalid hour, eg. hour (23:59:59.999 + 1 => 86400 ", async () => {
    try {
      // console.log(ti_instance);
      let result = await ti_instance.isIntoTimeInterval.call(86400);
      assert.equal(result.receipt.status, false);
    } catch (error) {
      // expect(error).has.a.property("data");
      let errorReason = getErrorReasonFromCall(error);
      // console.log("reason: ", errorReason);
      assert.equal(
        errorReason,
        "The given number/day not represents a valid day"
      );
    }
  });
});

// function used to catch the error reason when a call() function
// trows an exception "revert" in solidity
function getErrorReasonFromCall(err) {
  let data = err["data"];
  let firstKey = Object.keys(data)[0];
  let error_reason = data[firstKey]["reason"];
  return error_reason;
}
