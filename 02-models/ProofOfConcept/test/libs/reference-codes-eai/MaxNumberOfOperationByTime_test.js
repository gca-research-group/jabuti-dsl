// path to ->  ./test/libs/reference-codes-eai/MaxNumberOfOperationByTime_test.js 

const expect =  require('chai').expect;

const MaxNumberOfOperationByTime = artifacts.require('MaxNumberOfOperationByTime_refCod');

contract('MaxNumberOfOperationByTime', async()=>{

  let instance;
 
  beforeEach(async()=>{
    instance = await MaxNumberOfOperationByTime.deployed();
  });

  it('Check constructor', async()=>{
    let maxOp = await instance.getAllMaxOpByTime.call();
    expect(maxOp).to.be.an('array').length(7);
  });
// ########################## TEST SECOND ##########################
  context('check maxOpByTime : SECOND', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(0);
      expect(+maxOpByTime.amount).to.equal(2);
      expect(+maxOpByTime.timeUnit).to.equal(0);// 0 = EAI.SECOND
      expect(+maxOpByTime.byTime).to.equal(1);
      expect(+maxOpByTime.rest).to.equal(2);
      expect(+maxOpByTime.endTime).to.equal(0);
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(0);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(0, 1674487942 );
      maxOpByTime = await instance.getMaxOpByTime.call(0)
      expect(+maxOpByTime.rest).to.equal(1);
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(0)
      expect(+maxOpByTime.endTime).to.equal(1674487943);
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(0, 1674487942 );
      let maxOpByTime =  await instance.getMaxOpByTime.call(0);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(0, 1674487942 );
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(0);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(0, 1674487943 );
      maxOpByTime = await instance.getMaxOpByTime.call(0);
      expect(+maxOpByTime.endTime).to.equal(1674487944);
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });

// ########################## TEST MINUTE ##########################
// a referencia dos contador de minutos é time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : MINUTE', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(1);
      expect(+maxOpByTime.amount).to.equal(2);   // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(1); // 1 = EAI.MINUTE
      expect(+maxOpByTime.byTime).to.equal(60);  // 60 seconds
      expect(+maxOpByTime.rest).to.equal(2);     // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);  // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(1);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(1, 1674487950 );
      maxOpByTime = await instance.getMaxOpByTime.call(1)
      expect(+maxOpByTime.rest).to.equal(1);
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(1)
      expect(+maxOpByTime.endTime).to.equal(1674487980);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo final 950, com base no inicio da contagem 
      // do relógio unix (01/01/1970), o minuto corrente se encerra no 
      // segundo ...980
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(1, 1674487970);
      let maxOpByTime =  await instance.getMaxOpByTime.call(1);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(1, 1674487975);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(1);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(1, 1674487990);
      maxOpByTime = await instance.getMaxOpByTime.call(1);
      expect(+maxOpByTime.endTime).to.equal(1674488040);
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });



// ########################## TEST HOUR ##########################
// a referencia dos contador de minutos é time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : HOUR', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(2); // the position 2 contains a timeUnit HOUR
      expect(+maxOpByTime.amount).to.equal(2);   // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(2); // 2 = EAI.HOUR
      expect(+maxOpByTime.byTime).to.equal(3600);  // 3600 seconds
      expect(+maxOpByTime.rest).to.equal(2);     // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);  // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(2);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(2, 1674480000 );// the firs number '2' refere to the position of the vector
      maxOpByTime = await instance.getMaxOpByTime.call(2) // the number '2' refere to the vector position
      expect(+maxOpByTime.rest).to.equal(1); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(2)
      expect(+maxOpByTime.endTime).to.equal(1674482400);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1674480000, o endTime leva em consideração 
      // o inicio da contagem do relógio unix (01/01/1970 00:00:00), assim
      // a hora corrente encerrará no segundo 1674482400
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(2, 1674482399);
      let maxOpByTime =  await instance.getMaxOpByTime.call(2);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(2, 1674482399);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }

    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(2);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(2, 1674482400);
      maxOpByTime = await instance.getMaxOpByTime.call(2);
      expect(+maxOpByTime.endTime).to.equal(1674486000);
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });


  // ########################## TEST DAY ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : DAY', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(3); // the position 2 contains a timeUnit HOUR
      expect(+maxOpByTime.amount).to.equal(2);     // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(3);   // 3 = EAI.DAY
      expect(+maxOpByTime.byTime).to.equal(86400); // 86400 seconds
      expect(+maxOpByTime.rest).to.equal(2);       // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(3);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(3, 1674400000 );// the firs number '3' refere to the position of the vector
      maxOpByTime = await instance.getMaxOpByTime.call(3) // the number '3' refere to the vector position
      expect(+maxOpByTime.rest).to.equal(1); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(3)
      expect(+maxOpByTime.endTime).to.equal(1674432000);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1674400000, o endTime leva em consideração 
      // o inicio da contagem do relógio unix (01/01/1970 00:00:00), assim
      // a hora corrente encerrará no segundo 1674432000
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(3, 1674431999);
      let maxOpByTime =  await instance.getMaxOpByTime.call(3);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(3, 1674431999);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(3);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(3, 1674432000);
      maxOpByTime = await instance.getMaxOpByTime.call(3);
      expect(+maxOpByTime.endTime).to.equal(1674518400);
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });


// ########################## TEST WEEK ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : WEEK', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(4); // the position 2 contains a timeUnit HOUR
      expect(+maxOpByTime.amount).to.equal(2);     // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(4);   // 4 = EAI.WEEK
      expect(+maxOpByTime.byTime).to.equal(604800); // 604800 seconds
      expect(+maxOpByTime.rest).to.equal(2);       // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(4);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(4, 1670000000 );// the firs number '3' refere to the position of the vector
      maxOpByTime = await instance.getMaxOpByTime.call(4) // the number '3' refere to the vector position
      expect(+maxOpByTime.rest).to.equal(1); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(4)
      expect(+maxOpByTime.endTime).to.equal(1670716800);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1674400000, o endTime leva em consideração 
      // o inicio da contagem do relógio unix (01/01/1970 00:00:00), assim
      // a hora corrente encerrará no segundo 1674432000
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(4, 1670716700);
      let maxOpByTime =  await instance.getMaxOpByTime.call(4);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(4, 1670716799);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(4);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(4, 1670716800);
      maxOpByTime = await instance.getMaxOpByTime.call(4);
      expect(+maxOpByTime.endTime).to.equal(1671321600);
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });

// ########################## TEST MONTH ##########################
// a referencia dos contador é O time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : MONTH', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(5); // the position 2 contains a timeUnit HOUR
      expect(+maxOpByTime.amount).to.equal(2);     // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(5);   // 4 = EAI.MONTH
      expect(+maxOpByTime.byTime).to.equal(1);     // 1 MONTH  o mês não é medido em segundos, mas sim, em unidades de 1 a 12
      expect(+maxOpByTime.rest).to.equal(2);       // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(5);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(5, 1673000000 );// the firs number '3' refere to the position of the vector
      maxOpByTime = await instance.getMaxOpByTime.call(5) // the number '3' refere to the vector position
      expect(+maxOpByTime.rest).to.equal(1); // it was consumed one operation, then 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(5)
      expect(+maxOpByTime.endTime).to.equal(2);
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1673000000 (06/01/2023), o endTime leva em 
      // consideração o inicio de cada mês do ano como novo endTime, 
      // assim endTime do mês corrente ocorrerá em 01/02/2023 00:00:00 
      // representado pelo número '2', referente ao mẽs de fevereiro
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(5, 1674582515); // 24/01/2023
      let maxOpByTime =  await instance.getMaxOpByTime.call(5);
      expect(+maxOpByTime.rest).to.equal(0) 

      try{
        let result = await instance.decreaseOperation.call(5, 1674582515);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(5);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(5, 1675209600); // 01/02/2023 00:00:00
      maxOpByTime = await instance.getMaxOpByTime.call(5);
      expect(+maxOpByTime.endTime).to.equal(3);// the new endTime será '3', o inico do mẽs de março
      expect(+maxOpByTime.rest).to.equal(1); 
      // the rest is 1 because the amount operation is equal 2 and 
      // it was decreased 1 operation in last decrease operation
    });

  });

// ########################## TEST YEAR ##########################
// a referencia do contador é o time inicial do 
// do relógio UNIX, ou seja, 01/01/1970 00:00:00.

  context('check maxOpByTime : YEAR', async()=>{
    it('getMaxOpByTime properties', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(6); // the position 2 contains a timeUnit HOUR
      expect(+maxOpByTime.amount).to.equal(2);     // number of operation
      expect(+maxOpByTime.timeUnit).to.equal(6);   // 6 = EAI.YEAR
      expect(+maxOpByTime.byTime).to.equal(1);     // 1 YEAR  o mês não é medido em segundos, mas sim, em unidades de 1 a 12
      expect(+maxOpByTime.rest).to.equal(2);       // operation remaining number
      expect(+maxOpByTime.endTime).to.equal(0);    // the endTime will be set after the first operation drecrease
    });

    it('check decreaseOperation', async()=>{
      let maxOpByTime =  await instance.getMaxOpByTime.call(6);
      expect(+maxOpByTime.rest).to.equal(2);
      await instance.decreaseOperation(6, 1670686200 );// the seconds represent the date 10/12/2022
      maxOpByTime = await instance.getMaxOpByTime.call(6) // the number '6' refere to the vector position
      expect(+maxOpByTime.rest).to.equal(1); // it was consumed one operation, 
    });

    it('check endTime', async()=>{
      // after decrease an operation the new endTime is set.
      let maxOpByTime = await instance.getMaxOpByTime.call(6)
      expect(+maxOpByTime.endTime).to.equal(2023); // the endTime will be first second of the year 2023 (1672531200)
      // embora o end time foi definido no primeiro decrease operation
      // que ocorreu no segundo 1673000000 (06/01/2023), o endTime leva em 
      // consideração o inicio de cada mês do ano como novo endTime, 
      // assim endTime do mês corrente ocorrerá em 01/02/2023 00:00:00 
      // representado pelo número '2', referente ao mẽs de fevereiro
    });

    it('catch exception: there are no operation available', async()  =>{
      await instance.decreaseOperation(6, 1672531199); // 31/12/2022 23:59:59
      let maxOpByTime =  await instance.getMaxOpByTime.call(6);
      expect(+maxOpByTime.rest).to.equal(0) 
      try{
        let result = await instance.decreaseOperation.call(6, 1672531199);
        expect(result.receipt.status).to.equal(false);
      }catch (error) {
        let errorReason = getErrorReasonFromCall(error);
        expect(errorReason).to.equal("There are no operations available");
      }
    });

    it('start new endTime, reset and drecrease an operation', async()=>{
      let maxOpByTime = await instance.getMaxOpByTime.call(6);
      expect(+maxOpByTime.rest).to.equal(0)
      await instance.decreaseOperation(6, 1672531200); // 01/02/2023 00:00:00
      maxOpByTime = await instance.getMaxOpByTime.call(6);
      expect(+maxOpByTime.endTime).to.equal(2024);// the new endTime será '3', o inico do mẽs de março
      expect(+maxOpByTime.rest).to.equal(1); 
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