// path to ->  test ./test/libs/reference-codes-eai/07_MessageContentString_refCode_test.js 

const expect =  require('chai').expect;

const MessageContentString = artifacts.require('MessageContentString_refCod');

contract('MessageContentString_refCod', async()=>{
    let instance;
 
    beforeEach(async()=>{
      instance = await MessageContentString.deployed();
    });

    it('Check constructor', async()=>{
        let msgContent = await instance.getAllMessageContent.call();
        expect(msgContent).to.be.an('array').length(2);
    });

    it('getMessageContent_byId', async()=>{
        let msgContent = await instance.getMessageContent_byId.call(0);
        expect(msgContent.value).to.equal("98700000");
        expect(msgContent.op).to.equal("==")
    });

    it('verifyName', async()=>{
        let isEqual = await instance.verifyName('Eldair');
        expect(!isEqual).to.be.true

        isEqual = await instance.verifyName('Fabricio');
        expect(!isEqual).to.be.false
        
    });

});