const MaxNumber = artifacts.require("MaxNumberOfOperation_refCod");

module.exports = function (deployer) {
  deployer.deploy(MaxNumber);
};

