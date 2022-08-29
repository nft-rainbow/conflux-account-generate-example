package accounts;

import conflux.web3j.Account;
import conflux.web3j.Cfx;
import org.web3j.crypto.Credentials;
import org.web3j.utils.Numeric;

public class random {
    public void createTestnetRandom() throws Exception {
        Cfx cfx = Cfx.create("https://test.confluxrpc.com");
        Account acc = Account.random(cfx);
        System.out.println("Conlufx Testnet address: " + acc.getAddress());
    }

    public void createMainnetRandom() throws Exception {
        Cfx cfx = Cfx.create("https://main.confluxrpc.com");
        Account acc = Account.random(cfx);
        System.out.println("Conlufx Mainnet address: " + acc.getAddress());
    }

    public void createPrivateKeyRandom() throws Exception {
        Credentials credentials = Credentials.create(org.web3j.crypto.Keys.createEcKeyPair());
        System.out.println("Conflux privatekey: " + Numeric.toHexStringNoPrefix(credentials.getEcKeyPair().getPrivateKey()));
    }
}
