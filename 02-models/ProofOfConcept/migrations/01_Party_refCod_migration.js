const Party_refCod = artifacts.require("Party_refCod");

const procAddr = "0x5D07Ce6D61693985A15Bc59db551DBe05501c967";
const appAddr = "0x7854BdfE05BB4883bfAfaAD5ec0AC5Aa94BA0C06";

module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
