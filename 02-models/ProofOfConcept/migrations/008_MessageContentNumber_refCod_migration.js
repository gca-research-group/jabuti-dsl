const msgContentNumber = artifacts.require('MessageContentNumber_refCod');

module.exports = function(deployer){
    deployer.deploy(msgContentNumber);
}