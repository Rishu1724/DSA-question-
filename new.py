import hashlib

text = input("Enter text: ")

hash_obj = hashlib.sha1(text.encode())
print("SHA-1:", hash_obj.hexdigest())