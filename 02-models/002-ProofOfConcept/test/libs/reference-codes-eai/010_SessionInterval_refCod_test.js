// test ./test/libs/reference-codes-eai/010_SessionInterval_refCod_test.js

const expect = require('chai').expect;

const sessionInterval = artifacts.require('SessionInterval_refCod');

contract('SessionInterval_refCod_test', async()=>{

    let instance;
    beforeEach(async()=>{
        instance = await sessionInterval.deployed();
    });
    
    context('check sessionInterval : SINGLE SESSION', async()=>{ 
        
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
            await instance.startSingleSession(1,619);
            let session =  await instance.getSessionIntervalById(1);
            expect(+session.endTime).to.equal(620); // endTime is 620 because it started at 500 not 619, and the increment is 2 minutes (120 seconds) 
            
            await instance.startSingleSession(1,620); 
            session = await instance.getSessionIntervalById(1)
            expect(+session.endTime).to.equal(740);

            await instance.startSingleSession(3,1000);
            session = await instance.getSessionIntervalById(3);
            expect(+session.endTime).to.equal(173800);// this session have not started yet. 172800 +1000

            await instance.startSingleSession(3,173800);
            session = await instance.getSessionIntervalById(3);
            expect(+session.endTime).to.equal(346600);// this session have not started yet. 173800 +172800

        });
    });

    context('check sessionInterval : BY ID REFERENCE ', async()=>{ 
        
        it("Test sessionInterval by reference (nome) ", async()=>{
            await instance.startSessionByRef(2, "nome", "eldair", 10000);
            let sessionByInterval = await instance.getSessionIntervalByRef("nome", "eldair");

            expect(+sessionByInterval.durationInSeconds).to.equal(7200);
            expect(+sessionByInterval.endTime).to.equal(17200);

            await instance.startSessionByRef(2, "nome", "eldair", 17200);
            sessionByInterval = await instance.getSessionIntervalByRef("nome", "eldair");
            expect(+sessionByInterval.endTime).to.equal(24400);
        });

        it("Test sessionInterval by reference (cidade) ", async()=>{
            await instance.startSessionByRef(0, "cidade", "eldair", 10000);
            let sessionByInterval = await instance.getSessionIntervalByRef("cidade", "eldair");

            expect(+sessionByInterval.durationInSeconds).to.equal(2);
            expect(+sessionByInterval.endTime).to.equal(10002);

            await instance.startSessionByRef(0, "cidade", "eldair", 1001);
            sessionByInterval = await instance.getSessionIntervalByRef("cidade", "eldair");
            expect(+sessionByInterval.endTime).to.equal(10002);
            
 
            await instance.startSessionByRef(0, "cidade", "eldair", 10002);
            sessionByInterval = await instance.getSessionIntervalByRef("cidade", "eldair");
            expect(+sessionByInterval.endTime).to.equal(10004);
            
        });

        it("Test sessionInterval by reference (cidade)", async()=>{
            await instance.startSessionByRef(1, "cidade", "luis", 1000);
            let sessionByInterval = await instance.getSessionIntervalByRef("cidade", "luis");

            expect(+sessionByInterval.durationInSeconds).to.equal(120);
            expect(+sessionByInterval.endTime).to.equal(1120);

            await instance.startSessionByRef(0, "cidade", "luis", 1119);
            sessionByInterval = await instance.getSessionIntervalByRef("cidade", "luis");
            expect(+sessionByInterval.endTime).to.equal(1120);
            
 
            await instance.startSessionByRef(0, "cidade", "luis", 1121);
            sessionByInterval = await instance.getSessionIntervalByRef("cidade", "luis");
            expect(+sessionByInterval.endTime).to.equal(1241);
            
        });

        it( "Test isOpen sessionInterval by reference (cidade)  ", async()=>{            
            let sessionByInterval = await instance.isTheSessionByRefOpen("cidade", "luis", 1240);
            expect(+sessionByInterval).to.equal(1);

            sessionByInterval = await instance.isTheSessionByRefOpen("cidade", "luis", 1241);
            expect(+sessionByInterval).to.equal(0);

        });
        

    });



});