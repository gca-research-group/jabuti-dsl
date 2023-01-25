const Party_refCod = artifacts.require("Party_refCod");

// ganache in notebook - Lenovo
// const procAddr = "0x5D07Ce6D61693985A15Bc59db551DBe05501c967";
// const appAddr = "0x7854BdfE05BB4883bfAfaAD5ec0AC5Aa94BA0C06";

// ganache in desktop LG - GCA 
const procAddr = "0xc1d20EB6f583EEd7B3717F275755d566Eb6BfD70";
const appAddr = "0xE49fCA4C6c90885406FbF75DF4d1Ff4965762C5A";

module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
