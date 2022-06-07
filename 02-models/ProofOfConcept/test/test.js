const  deliveryHiring= artifacts.require('DeliveryHiring');

contract ('deliveryHiring', accounts =>{
    it ('Function: 1. requestDelivery(string memory _accessDateTime)', async()=>{
        let instance = await deliveryHiring.deployed();
        const date=await instance.requestDelivery.call('2022-06-01 08:30:20', {from: accounts[1]});
        console.log(date)
    });
});