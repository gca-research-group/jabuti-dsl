const Party_refCod = artifacts.require("Party_refCod");

// ganache in notebook - Lenovo - Ubuntu
// const procAddr = "0x5D07Ce6D61693985A15Bc59db551DBe05501c967";
// const appAddr = "0x7854BdfE05BB4883bfAfaAD5ec0AC5Aa94BA0C06";

// ganache in notebook - Lenovo - Windows
// const procAddr = "0x16e37d1cA1B6fe49aB58bc4ea95a95FBc4cE7EC3";
// const appAddr = "0xFae0c32A0C5602212c6073DA17f34E720F2C8f82";

// servidor - GCA 
// const procAddr = "0x77425a4c279DE94E2bac81fa9869b086b9c44989";
// const appAddr = "0xFfF1AF45A42446f9eAEDf95F962fc58E0a86a2F1";

// PC DELL - GCA 
const procAddr = "0x61E4Faf8cffa0Be4b4515Fa79e1E34DD3217dfd0";
const appAddr = "0x247E4F1a18945BFdCB1b61251649f4558AEEc194";


module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
