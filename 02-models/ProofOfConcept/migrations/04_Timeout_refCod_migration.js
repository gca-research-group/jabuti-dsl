const Timeout_refCod = artifacts.require("Timeout_refCod");

module.exports = function (deployer) {
  deployer.deploy(Timeout_refCod);
};
