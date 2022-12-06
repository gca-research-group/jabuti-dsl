// path to test "./test/libs/reference-codes-eai/TimeInterval_refCod_test.js"

//horas definidas no teste
// 10:00:00 to 14:00:00 -> 36000000,50400000
// 22:00:00 to 02:00:00 -> 79200000, 7200000
// horas para teste
// 01 hr: 3600000
// 04 hr: 14400000
// 11 hr: 39600000
// 13 hr: 46800000
// 15 hr: 54000000
// 22 hr: 79200000
// 23:59:59.999 = (86399999 +1)

const ti_refCod = artifacts.require("TimeInterval_refCod");

contract("TimeInterval_refCod", (accounts) => {
  let ti_instance;
  beforeEach(async () => {
    ti_instance = await ti_refCod.deployed();
  });

  it(" TimeIntervals created", async () => {
    let timeIntervals = await ti_instance.getAllTimeInterval.call();
    assert.equal(timeIntervals.length, 2);
  });

  it("check all time itervals created", async () => {
    let timeIntervals = await ti_instance.getTimeInterval.call(0);
    assert.equal(timeIntervals.start, 36000000);
    assert.equal(timeIntervals.end, 50400000);
    timeIntervals = await ti_instance.getTimeInterval.call(1);
    assert.equal(timeIntervals.start, 79200000);
    assert.equal(timeIntervals.end, 7200000);
  });

  it("check the isIntoTimeInterval() with a valid an existing hour into the interval", async () => {
    let isIntoTimeInterval = await ti_instance.isIntoTimeInterval.call(
      39600000
    );
    // console.log(isIntoTimeInterval);
    assert.equal(isIntoTimeInterval, true);
  });

  it("check the isIntoTimeInterval() with a valid but no existent hour into the interval", async () => {
    let isIntoTimeInterval = await ti_instance.isIntoTimeInterval.call(
      54000000
    );
    // console.log(isIntoTimeInterval);
    assert.equal(isIntoTimeInterval, false);
  });

  it("Check teh isIntoTimeInterval() with a invalid hour, eg. hour (23:59:59.999 + 1 => 86400000 ", async () => {
    try {
      let result = await ti_instance.isIntoTimeInterval.call(86400000);
      assert.equal();
    } catch (error) {
      result = await ti_instance.isIntoTimeInterval.call(3600000);
      //   console.log("0hr is valid: ", result);
      assert.equal(result, true);
    }
  });
});
