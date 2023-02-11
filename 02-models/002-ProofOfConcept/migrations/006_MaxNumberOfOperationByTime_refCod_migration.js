const maxOp_byTyme = artifacts.require('MaxNumberOfOperationByTime_refCod');

module.exports = function(deployer){
    deployer.deploy(maxOp_byTyme)
}