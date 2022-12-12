# polish
Decryption type:

0 = Brute Force
1 = Dictionary

Hash type:
(Note that for Crypt, you can only do 10 rounds) 

M = MD5
B = BCrypt
S = Sha256

Format:

(Decryption type) (Hash type) (hash)
Ex: 1 M 0f18fd4cf40bfb1dec646807c7fa5522 - decrypts an MD5 hash using a dictionary attack

Dependencies:

- GitHub
- GitBash
- at.favre.lib:bcrypt:0.9.0
