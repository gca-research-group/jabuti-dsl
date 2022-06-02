const DeliveryHiring  = artifacts.require("DeliveryHiring");

module.exports = function (deployer) {
   deployer.deploy(DeliveryHiring, '0x852475312D21157f91E9CA651a390ebB87c80710','0x37c15b42d042023079C0Ee60b9C2B6F704aeDFDD' );
};

