from itertools import chain
from cfx_account import Account
import os

# by default, the api uses os.urandom as random source,
# edit entropy to provide extra randomness
entropy = os.environ.get("ENTROPY", "")
local_account = Account.create(entropy)

chain_id = int(os.environ.get("CHAIN_ID", "1029"))

print(f"private key: {local_account._private_key.hex()}")
print(f"address: {local_account.get_base32_address(chain_id)}")
