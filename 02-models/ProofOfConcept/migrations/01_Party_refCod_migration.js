const Party_refCod = artifacts.require("Party_refCod");

// ganache in notebook - Lenovo
// const procAddr = "0x5D07Ce6D61693985A15Bc59db551DBe05501c967";
// const appAddr = "0x7854BdfE05BB4883bfAfaAD5ec0AC5Aa94BA0C06";

// ganache in desktop LG - GCA 
const procAddr = "0xb466e977d4a8835eE573069c0635e161A62b9d23";
const appAddr = "0x8893CBCa1596575B0a9c987232e75d932fd347F0";

module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
