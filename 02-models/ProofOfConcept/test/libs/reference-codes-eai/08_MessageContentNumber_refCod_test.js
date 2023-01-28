// path to -> test ./test/libs/reference-codes-eai/08_MessageContentNumber_refCod_test.js

const expect = require('chai').expect;

const MessageContentNumber = artifacts.require('MessageContentNumber_refCod');

contract ('MessageContentNumber_refCod', async()=>{

let instance;

    beforeEach(async()=>{
        instance = await MessageContentNumber.deployed();
    });

    it('check construtor', async()=>{
        let msgContent = await instance.getAllMessageContents.call();
        expect(msgContent).to.be.an('array').length(6);

        expect(msgContent[0].op).to.equal("!=");
        expect(+msgContent[0].content).to.equal(1);
  
        expect(msgContent[5].op).to.equal(">=");
        expect(+msgContent[5].content).to.equal(6);  
    });


    it('evaluate message content number', async()=>{
        let msgContent = await instance.getMessageContentById.call(0);
        expect(msgContent.xpath).to.equal("count(//cep)");
        expect(msgContent.op).to.equal("!=");
        expect(+msgContent.content).to.equal(1);


        result = await instance.evaluateMessageContent(0, 1);
        expect(result).to.be.false;
        
        result = await instance.evaluateMessageContent(0, 2);
        expect(result).to.be.true;

        result = await instance.evaluateMessageContent(1, 2);
        expect(result).to.be.true;
        
        result = await instance.evaluateMessageContent(2, 3);
        expect(result).to.be.false;
        
        result = await instance.evaluateMessageContent(3, 4);
        expect(result).to.be.true;
        
        result = await instance.evaluateMessageContent(4, 5);
        expect(result).to.be.false;
        
        result = await instance.evaluateMessageContent(5, 6);
        expect(result).to.be.true;
        
        // result = await instance.evaluateMessageContent(6, 1);
        // expect(result).to.be.false;
        
    });

});