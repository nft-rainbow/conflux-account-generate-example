# javascript generate conflux account

## [js-conflux-sdk](https://github.com/Conflux-Chain/js-conflux-sdk/blob/v2/docs/api/wallet/PrivateKeyAccount.md)

```shell
# install js sdk
$ npm install js-conflux-sdk
```

Detail code

```js
const { PrivateKeyAccount } = require('js-conflux-sdk');
const crypto = require('crypto');

const MAINNET_ID = 1029;
const TESTNET_ID = 1;

const account1 = PrivateKeyAccount.random(crypto.randomBytes(32), MAINNET_ID);
console.log('Conflux mainnnet account: ', account1);

const account2 = PrivateKeyAccount.random(crypto.randomBytes(32), TESTNET_ID);
console.log('Conflux testnet account: ', account2);
```

```shell
$ node random-account.js
# PrivateKeyAccount {
#   address: 'cfx:aapentjj69a7pr8t2hc3fmmuk59n7z4bbaxh0t6xfn',
#   publicKey: '0x7bd44b1033919ed8a7f4f6d91ef27b5e066ac71d5a5db5e7384d1f5fb8e2173aae8f1c206e7bef69395733aa980227f82199c299c0523e3a183f9017b9078897',
#   privateKey: '0x2ae3d884b418b95a95b4778a19ec5ebdc426c922a10872a96846f3cc94e2bf1d',
#   networkId: 1029
# }
# PrivateKeyAccount {
#   address: 'cfxtest:aamuzfa5mks6a1w5mpu0hrss4s716acwwak366j35k',
#   publicKey: '0x92ce8917d362cefb5e97af54bd4e8181568b9e63ef40a2d581a26dc73b431b0efbc715fc5e2d4df41df135b6e545e1e51e9f7e8fe18bc3429d93db3bd5c31ec8',
#   privateKey: '0x749c106e8b539178df1c730a3b024d245bd389131a08eff674debc0bb9169803',
#   networkId: 1
# }
```

## [hdwallet](https://github.com/Conflux-Chain/ts-conflux-sdk/tree/main/packages/hdwallet)

```shell
$ npm install @conflux-dev/hdwallet
```

Detail code

```js
const { HDWallet } = require('@conflux-dev/hdwallet');

const mnemonic =  HDWallet.generateMnemonic();
// faint also eye industry survey unhappy boil public lemon myself cube sense

const wallet = new HDWallet(mnemonic);

const privateKey0 = wallet.getPrivateKeyByIndex(0);
console.log(privateKey0.toString('hex'));
// 40d0f137665463584cc57fce2b761572a85d1cbf1601fc93d001c129b2a11c92
const privateKey1 = wallet.getPrivateKey("m/44'/503'/0'/0/1");
console.log(privateKey0.toString('hex'));
```
