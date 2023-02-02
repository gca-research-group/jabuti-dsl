const wdi_refCod = artifacts.require("WeekDaysInterval_refCod");

module.exports = function (deployer) {
  deployer.deploy(wdi_refCod);
};
