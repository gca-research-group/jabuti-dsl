// path to test ./test/libs/reference-codes-eai/02_WeekDaysInterval_refCod_test.js
const wdi_refCod = artifacts.require("WeekDaysInterval_refCod");

contract("WeekDaysInterval_refCod", (accounts) => {
  let wdi_instance;
  beforeEach(async () => {
    wdi_instance = await wdi_refCod.deployed();
  });

  it("The weekDaysInterval were created correctly", async () => {
    let amountIntervals = await wdi_instance.getAmountOfWeekDaysInterval.call();
    assert.equal(amountIntervals, 2);
  });

  it("Checked all week days interval created: getAllWeekDaysInteval()", async () => {
    let wdi_all = await wdi_instance.getAllWeekDaysInterval.call();
    assert.equal(wdi_all.length, 2);
    assert.equal(wdi_all[0].start, 1);
    assert.equal(wdi_all[0].end, 2);
    assert.equal(wdi_all[1].start, 4);
    assert.equal(wdi_all[1].end, 6);
  });

  it("Check the isIntoWeekDaysIntervals()  with a corret number/day ", async () => {
    let isValid = await wdi_instance.isIntoWeekDaysIntervals.call(2);
    assert.equal(isValid, true);
  });

  it("Check the isIntoWeekDaysIntervals() with a not valid day ", async () => {
    try {
      const result = await wdi_instance.isIntoWeekDaysIntervals(7);
      assert.equal(result.receipt.status, false);
    } catch (error) {
      let isValid = await wdi_instance.isIntoWeekDaysIntervals.call(2);
      assert.equal(isValid, true);
    }
  });

  it("Catch a expeption when try to set invalid day in a exist weekDayIntervals", async () => {
    try {
      let result = await wdi_instance.setWeekDaysInterval.call(1, 2, 9);
      assert.equal(result.receipt.status, false);
    } catch (error) {

      let errorReason = getErrorReasonFromCall(error)
      assert.equal(errorReason, "The _endDay not represents a valid day");
    }
  });
});

function getErrorReasonFromCall(err) {
  let data = err["data"];
  let firstKey = Object.keys(data)[0];
  let error_reason = data[firstKey]["reason"];
  return error_reason;
} 
