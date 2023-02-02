const msgContent = artifacts.require('MessageContentString_refCod')

module.exports = function(deployer){
    deployer.deploy(msgContent)
}