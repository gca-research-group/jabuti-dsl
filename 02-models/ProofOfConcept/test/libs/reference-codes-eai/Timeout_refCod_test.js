// path to test "./test/libs/reference-codes-eai/Timeout_refCod_test.js"

const expect = require("chai").expect;
const timeout_refCod = artifacts.require("Timeout_refCod");

contract("Timeout_refCod", (accounts) => {
  let to_instance;
  beforeEach(async () => {
    // to_instance = await timeout_refCod.deployed();
    to_instance = await timeout_refCod.new();
  });

  it("constructor", async () => {
    let timeouts = await to_instance.getAllTimeouts.call();

    console.log(timeouts);
  });
});
