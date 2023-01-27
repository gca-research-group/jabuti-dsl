// path to -> test ./test/libs/reference-codes-eai/MaxNumberOfOperation_test.js

const expect = require("chai").expect;
const MaxNumberOfOperation = artifacts.require("MaxNumberOfOperation_refCod");

contract("Max Number Of Operation: ",()=>{

  let instance;
  beforeEach(async () => {
    instance = await MaxNumberOfOperation.deployed();
  });

  it('Check constructor, get array maxOperation',async ()=>{
    let vet_maxN_Op = await instance.getAllMaxOperation.call();
    expect(vet_maxN_Op).to.be.an("array").length(2);
    expect(+vet_maxN_Op[0].amount).to.equal(5);
  });

  it('getMaxOpById()', async () =>{
    let maxOperation = await instance.getMaxOperationById.call(1); 
    expect(+maxOperation.amount).to.equal(3);
  });

  it('decreaseOperation()', async ()=>{
    let maxOperation = await instance.getMaxOperationById.call(0);
    expect(+maxOperation.rest).to.equal(5);
    await instance.decreaseOperation();
    maxOperation = await instance.getMaxOperationById.call(0);
    expect(+maxOperation.rest).to.equal(4);
  });

});