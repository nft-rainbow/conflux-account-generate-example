const { PrivateKeyAccount } = require('js-conflux-sdk');
const crypto = require('crypto');

const MAINNET_ID = 1029;
const TESTNET_ID = 1;

const account1 = PrivateKeyAccount.random(crypto.randomBytes(32), MAINNET_ID);
console.log('Conflux mainnnet account: ', account1);

const account2 = PrivateKeyAccount.random(crypto.randomBytes(32), TESTNET_ID);
console.log('Conflux testnet account: ', account2);