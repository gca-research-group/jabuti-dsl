// test ./test/libs/reference-codes-eai/010_SessionInterval_refCod_test.js

const expect = require('chai').expect;

const sessionInterval = artifacts.require('SessionInterval_refCod');

contract('SessionInterval_refCod_test', async()=>{

    let instance;
    beforeEach(async()=>{
        instance = await sessionInterval.deployed();
    });

    it('Check constructor', async()=>{
        let sessionInterval = await instance.getAllSingleSessionInterval.call();
        expect(sessionInterval).to.be.an('array').length(4);
    });

    it('check the duration of each session ', async()=>{

        let allSession =  await instance.getAllSingleSessionInterval();
        expect(+allSession[0].durationInSeconds).to.equal(2);
        expect(+allSession[1].durationInSeconds).to.equal(120);        
        expect(+allSession[2].durationInSeconds).to.equal(7200);
        expect(+allSession[3].durationInSeconds).to.equal(172800);

    });

    it('test endTime after start a new sesion', async()=>{
        await instance.startSingleSession(1,500);
        let session =  await instance.getSessionIntervalById(1);
        expect(+session.endTime).to.equal(620);
    });



});