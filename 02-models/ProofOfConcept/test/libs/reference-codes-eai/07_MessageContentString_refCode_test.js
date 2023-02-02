// test ./test/libs/reference-codes-eai/07_MessageContentString_refCode_test.js 

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
        expect(msgContent[0].op).to.equal("==");
        expect(msgContent[0].xpath).to.equal("//cep/text()");
        expect(msgContent[0].content).to.equal("98700000");

        expect(msgContent[1].op).to.equal("!=");
        expect(msgContent[1].xpath).to.equal("//nome/text()");
        expect(msgContent[1].content).to.equal("Eldair");
    });

    it('getMessageContent_byId', async()=>{
        let msgContent = await instance.getMessageContent_byId.call(0);
        expect(msgContent.xpath).to.equal("//cep/text()");
        expect(msgContent.op).to.equal("==");
        expect(msgContent.content).to.equal("98700000");
    });

    it('Check if name is different from Eldair', async()=>{
        let msgContent = await instance.getMessageContent_byId.call(1);
        expect(msgContent.content).to.equal("Eldair");
        expect(msgContent.op).to.equal("!=");
        // the evaluateStringContent should return false if we 
        // pass a string "Eldair" 
        let result = await instance.evaluateStringContent(1,"Eldair"); 
        expect(result).to.be.false;
    });

});