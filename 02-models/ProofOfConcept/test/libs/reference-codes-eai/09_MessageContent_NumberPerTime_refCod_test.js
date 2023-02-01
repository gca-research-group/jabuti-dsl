// path to test: test ./test/libs/reference-codes-eai/09_MessageContent_NumberPerTime_refCod_test.js

const expect = require('chai').expect;

const MsgContent_NumberPerTime = artifacts.require('MessageContent_NumberPerTime_refCod');

contract('MessageContract_NumberPerTime_refcod', async()=>{

    let instance;
    beforeEach(async()=>{
        instance = await MsgContent_NumberPerTime.deployed();
    });

    it('Check constructor', async()=>{
        let msgContent = await instance.getAllmsgContent.call();
        expect(msgContent).to.be.an('array').length(7)


    });

// ########################## TEST SECOND ##########################
  context('check msgContent : SECOND', async()=>{
    it('get msgContent properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(0);

        expect(msgContent.xpath).to.equal("count(//address)");
        expect(msgContent.op).to.equal("<=");
        expect(+msgContent.amount).to.equal(2);
        expect(+msgContent.timeUnit).to.equal(0);// 0 = EAI.SECOND
        expect(+msgContent.byTime).to.equal(1);
        expect(+msgContent.rest).to.equal(2)
        expect(+msgContent.endTime).to.equal(0)
    });

    it('Decrease MsgContentResultXpath From Amount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(0);
      expect(+msgContent.rest).to.equal(2);
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(0, 1674487942, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(0)
      expect(+msgContent.rest).to.equal(1);
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(0)
      expect(+msgContent.endTime).to.equal(1674487943);
    });

    it('catch exception: there are no value to decrease', async()  =>{
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(0, 1674487942, auxValueToDecrease);
      let msgContent =  await instance.getMessageContentById.call(0);
      expect(+msgContent.rest).to.equal(0) 

      try{
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(0, 1674487942, auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 0 from 2 resting, and the message contet xpath result is 1");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(0);
      expect(+msgContent.rest).to.equal(0)
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(0, 1674487943, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(0);
      expect(+msgContent.endTime).to.equal(1674487944);
      expect(+msgContent.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });


// ########################## TEST MINUTE ##########################
  context('check msgContent : MINUTE', async()=>{
    it('get msgContent properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(1);

        expect(msgContent.xpath).to.equal("count(//cep)");
        expect(msgContent.op).to.equal("<=");
        expect(+msgContent.amount).to.equal(3);
        expect(+msgContent.timeUnit).to.equal(1);// 1 = EAI.MINUTE
        expect(+msgContent.byTime).to.equal(60);
        expect(+msgContent.rest).to.equal(3)
        expect(+msgContent.endTime).to.equal(0)
    });

    it('Decrease MsgContentResultXpath From Amount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(1);
      expect(+msgContent.rest).to.equal(3);
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(1, 1674487942, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(1)
      expect(+msgContent.rest).to.equal(2);
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(1)
      expect(+msgContent.endTime).to.equal(1674487980);
    });

    it('catch exception: there are no value to decrease', async()  =>{
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(1, 1674487942, auxValueToDecrease);
      let msgContent =  await instance.getMessageContentById.call(1);
      expect(+msgContent.rest).to.equal(0) 

      try{
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(1, 1674487942, auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 0 from 3 resting, and the message contet xpath result is 2");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(1);
      expect(+msgContent.rest).to.equal(0)
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(1, 1674487980, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(1);
      expect(+msgContent.endTime).to.equal(1674488040);
      expect(+msgContent.rest).to.equal(2); 
    });

  });


// ########################## TEST HOUR ##########################
  context('check msgContent : HOUR', async()=>{
    it('get msgContent properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(2);

        expect(msgContent.xpath).to.equal("count(//address)");
        expect(msgContent.op).to.equal("<=");
        expect(+msgContent.amount).to.equal(4);
        expect(+msgContent.timeUnit).to.equal(2);// 2 = EAI.HOUR
        expect(+msgContent.byTime).to.equal(3600);
        expect(+msgContent.rest).to.equal(4)
        expect(+msgContent.endTime).to.equal(0)
    });

    it('Decrease MsgContentResultXpath From Amount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(2);
      expect(+msgContent.rest).to.equal(4);
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(2, 1674487942, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(2)
      expect(+msgContent.rest).to.equal(2);
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(2)
      expect(+msgContent.endTime).to.equal(1674489600);
    });

    it('catch exception: there are no value to decrease', async()  =>{
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(2, 1674487942, auxValueToDecrease);
      let msgContent =  await instance.getMessageContentById.call(2);
      expect(+msgContent.rest).to.equal(0) 

      try{
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(2, 1674487942, auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 0 from 4 resting, and the message contet xpath result is 2");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(2);
      expect(+msgContent.rest).to.equal(0)
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(2, 1674489600, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(2);
      expect(+msgContent.endTime).to.equal(1674493200);
      expect(+msgContent.rest).to.equal(3); 
    });

  });

 // ########################## TEST DAY ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check msgContent : DAY', async()=>{
    it('getMessageContentById properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(3); // the position 3 contains a timeUnit DAY
      expect(+msgContent.amount).to.equal(4);     // number of operation
      expect(+msgContent.timeUnit).to.equal(3);   // 3 = EAI.DAY
      expect(+msgContent.byTime).to.equal(86400); // 86400 seconds
      expect(+msgContent.rest).to.equal(4);       // operation remaining number
      expect(+msgContent.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });
    
    it('check decreaseMsgContentResultXpathFromAmount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(3);
      expect(+msgContent.rest).to.equal(4);
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(3, 1674400000, auxValueToDecrease );// the firs number '3' refere to the position of the vector
      msgContent = await instance.getMessageContentById.call(3) // the number '3' refere to the vector position
      expect(+msgContent.rest).to.equal(2); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(3)
      expect(+msgContent.endTime).to.equal(1674432000);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1674400000, o endTime leva em consideração 
      // o inicio da contagem do relógio unix (01/01/1970 00:00:00), assim
      // a hora corrente encerrará no segundo 1674432000
    });

    it('catch exception: there are no operation available', async()  =>{
      auxValueToDecrease=1;
      await instance.decreaseMsgContentResultXpathFromAmount(3, 1674431999, auxValueToDecrease);
      let msgContent =  await instance.getMessageContentById.call(3);
      expect(+msgContent.rest).to.equal(1) 

      try{
        auxValueToDecrease = 2;
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(3, 1674431999,auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 1 from 4 resting, and the message contet xpath result is 2");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(3);
      expect(+msgContent.rest).to.equal(1)
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(3, 1674432000, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(3);
      expect(+msgContent.endTime).to.equal(1674518400);
      expect(+msgContent.rest).to.equal(2); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });


// ########################## TEST WEEK ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check msgContent : WEEK', async()=>{
    it('getMessageContentById properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(4); // the position 2 contains a timeUnit HOUR
      expect(+msgContent.amount).to.equal(3);     // number of operation
      expect(+msgContent.timeUnit).to.equal(4);   // 4 = EAI.WEEK
      expect(+msgContent.byTime).to.equal(604800); // 604800 seconds
      expect(+msgContent.rest).to.equal(3);       // operation remaining number
      expect(+msgContent.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseMsgContentResultXpathFromAmount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(4);
      expect(+msgContent.rest).to.equal(3);
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(4, 1670000000, auxValueToDecrease);// the firs number '3' refere to the position of the vector
      msgContent = await instance.getMessageContentById.call(4) // the number '3' refere to the vector position
      expect(+msgContent.rest).to.equal(2); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(4)
      expect(+msgContent.endTime).to.equal(1670716800);
      // embora o end time foi definido no primeiro decrease 
      // que ocorreu no segundo 1674400000, o endTime leva em consideração 
      // o inicio da contagem do relógio unix (01/01/1970 00:00:00), assim
      // a hora corrente encerrará no segundo 1674432000
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseMsgContentResultXpathFromAmount(4, 1670716700, auxValueToDecrease);
      let msgContent =  await instance.getMessageContentById.call(4);
      expect(+msgContent.rest).to.equal(1) 

      try{
        auxValueToDecrease = 2;
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(4, 1670716799, auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 1 from 3 resting, and the message contet xpath result is 2");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(4);
      expect(+msgContent.rest).to.equal(1)
      await instance.decreaseMsgContentResultXpathFromAmount(4, 1670716800, auxValueToDecrease);
      msgContent = await instance.getMessageContentById.call(4);
      expect(+msgContent.endTime).to.equal(1671321600);
      expect(+msgContent.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });

// ########################## TEST MONTH ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check msgContent : MONTH', async()=>{
    it('getMessageContentById properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(5); // the position 2 contains a timeUnit HOUR
      expect(+msgContent.amount).to.equal(5);     // number of operation
      expect(+msgContent.timeUnit).to.equal(5);   // 5 = EAI.MONTH
      expect(+msgContent.byTime).to.equal(1);     // 1 MONTH  o mês não é medido em segundos, mas sim, em unidades de 1 a 12
      expect(+msgContent.rest).to.equal(5);       // operation remaining number
      expect(+msgContent.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseMsgContentResultXpathFromAmount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(5);
      expect(+msgContent.rest).to.equal(5);
      auxValueToDecrease = 3;
      await instance.decreaseMsgContentResultXpathFromAmount(5, 1673000000, auxValueToDecrease);// the firs number '3' refere to the position of the vector
      msgContent = await instance.getMessageContentById.call(5) // the number '3' refere to the vector position
      expect(+msgContent.rest).to.equal(2); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(5)
      expect(+msgContent.endTime).to.equal(2);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1673000000 (06/01/2023), o endTime leva em 
      // consideração o inicio de cada mês do ano como novo endTime, 
      // assim endTime do mês corrente ocorrerá em 01/02/2023 00:00:00 
      // representado pelo número '2', referente ao mẽs de fevereiro
    });

    it('catch exception: there are no operation available', async()  =>{
      auxValueToDecrease = 2;
      await instance.decreaseMsgContentResultXpathFromAmount(5, 1674582515,auxValueToDecrease); // 24/01/2023
      let msgContent =  await instance.getMessageContentById.call(5);
      expect(+msgContent.rest).to.equal(0) 

      try{
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(5, 1674582515,auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 0 from 5 resting, and the message contet xpath result is 2");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(5);
      expect(+msgContent.rest).to.equal(0)
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(5, 1675209600, auxValueToDecrease); // 01/02/2023 00:00:00
      msgContent = await instance.getMessageContentById.call(5);
      expect(+msgContent.endTime).to.equal(3);// the new endTime será '3', o inico do mẽs de março
      expect(+msgContent.rest).to.equal(4); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });

// ########################## TEST YEAR ##########################
// a referencia do contador é o time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check msgContent : YEAR', async()=>{
    it('getMessageContentById properties', async()=>{
      let msgContent = await instance.getMessageContentById.call(6); // the position 2 contains a timeUnit HOUR
      expect(+msgContent.amount).to.equal(2);     // number of operation
      expect(+msgContent.timeUnit).to.equal(6);   // 6 = EAI.YEAR
      expect(+msgContent.byTime).to.equal(1);     // 1 YEAR  o mês não é medido em segundos, mas sim, em unidades de 1 a 12
      expect(+msgContent.rest).to.equal(2);       // operation remaining number
      expect(+msgContent.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseMsgContentResultXpathFromAmount', async()=>{
      let msgContent =  await instance.getMessageContentById.call(6);
      expect(+msgContent.rest).to.equal(2);
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(6, 1670686200,auxValueToDecrease );// the seconds represent the date 10/12/2022
      msgContent = await instance.getMessageContentById.call(6) // the number '6' refere to the vector position
      expect(+msgContent.rest).to.equal(1); // it was consumed one operation, 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let msgContent = await instance.getMessageContentById.call(6)
      expect(+msgContent.endTime).to.equal(2023); // the endTime will be first second of the year 2023 (1672531200)
      // embora o end time foi definido no primeiro decrease 
      // que ocorreu no segundo 1673000000 (06/01/2023), o endTime leva em 
      // consideração o inicio de cada mês do ano como novo endTime, 
      // assim endTime do mês corrente ocorrerá em 01/02/2023 00:00:00 
      // representado pelo número '2', referente ao mẽs de fevereiro
    });

    it('catch exception: there are no operation available', async()  =>{
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(6, 1672531199, auxValueToDecrease); // 31/12/2022 23:59:59
      let msgContent =  await instance.getMessageContentById.call(6);
      expect(+msgContent.rest).to.equal(0) 
      try{
        let result = await instance.decreaseMsgContentResultXpathFromAmount.call(6, 1672531199, auxValueToDecrease);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("You have only 0 from 2 resting, and the message contet xpath result is 1");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let msgContent = await instance.getMessageContentById.call(6);
      expect(+msgContent.rest).to.equal(0)
      auxValueToDecrease = 1;
      await instance.decreaseMsgContentResultXpathFromAmount(6, 1672531200,auxValueToDecrease); // 01/02/2023 00:00:00
      msgContent = await instance.getMessageContentById.call(6);
      expect(+msgContent.endTime).to.equal(2024);// the new endTime será '3', o inico do mẽs de março
      expect(+msgContent.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });


});

function getErrorReasonFromCall(err) {
    let data = err["data"];
    let firstKey = Object.keys(data)[0];
    let error_reason = data[firstKey]["reason"];
    return error_reason;
}