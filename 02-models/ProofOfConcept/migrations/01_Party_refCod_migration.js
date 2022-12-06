const Party_refCod = artifacts.require("Party_refCod");

const procAddr = "0x271C9601Cc58D2d6D949e83F4Ca22b2528aEBb8f";
const appAddr = "0xF05474682f036Ff203092B7537b31314D926ae63";

module.exports = function (deployer) {
  deployer.deploy(Party_refCod, appAddr, { from: procAddr });
};
