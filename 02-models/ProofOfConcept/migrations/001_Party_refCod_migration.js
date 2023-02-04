const Party_refCod = artifacts.require("Party_refCod");

// ganache in notebook - Lenovo
const procAddr = "0x5D07Ce6D61693985A15Bc59db551DBe05501c967";
const appAddr = "0x7854BdfE05BB4883bfAfaAD5ec0AC5Aa94BA0C06";

// ganache in desktop LG - GCA 
// const procAddr = "0xb466e977d4a8835eE573069c0635e161A62b9d23";
// const appAddr = "0x8893CBCa1596575B0a9c987232e75d932fd347F0";

// ganache in desktop DELL - GCA 
// const procAddr = "0x61E4Faf8cffa0Be4b4515Fa79e1E34DD3217dfd0";
// const appAddr = "0x247E4F1a18945BFdCB1b61251649f4558AEEc194";

module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
