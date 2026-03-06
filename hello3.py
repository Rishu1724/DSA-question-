# RSA Implementation with User Input

def power(base, expo, m):
    res = 1
    base = base % m

    while expo > 0:
        if expo & 1:
            res = (res * base) % m

        base = (base * base) % m
        expo = expo // 2

    return res


# Encrypt message
def encrypt(m, e, n):
    return power(m, e, n)


# Decrypt message
def decrypt(c, d, n):
    return power(c, d, n)


# Main Program
if __name__ == "__main__":

    # User input for keys
    e = int(input("Enter Public Key (e): "))
    d = int(input("Enter Private Key (d): "))
    n = int(input("Enter n: "))

    # User input for message
    M = int(input("Enter Plain Text (number): "))

    # Encryption
    C = encrypt(M, e, n)
    print("Encrypted Message:", C)

    # Decryption
    decrypted = decrypt(C, d, n)
    print("Decrypted Message:", decrypted)