const msgContentNumber_PerTime = artifacts.require('MessageContent_NumberPerTime_refCod');

module.exports = function(deployer){
    deployer.deploy(msgContentNumber_PerTime);
}