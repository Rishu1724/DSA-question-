# Python program to generate SHA-1 hash of a given text

import hashlib

# Input message
text = input("Enter the text: ")

# Convert text to bytes
message = text.encode()

# Create SHA-1 hash object
sha1 = hashlib.sha1()

# Update the hash object with the message
sha1.update(message)

# Get the hexadecimal digest
digest = sha1.hexdigest()

# Display the result
print("SHA-1 Message Digest:", digest)







# Develop a program to implement secure hash algorithm (SHA-1) 
# 9. Calculate the message digest of a text using the SHA-1 algorithm


# Python program to generate SHA-1 hash (message digest)

import hashlib

def sha1_hash(message):
    # Create SHA-1 hash object
    sha1 = hashlib.sha1()
   
    # Update the hash object with the message
    sha1.update(message.encode('utf-8'))
   
    # Return hexadecimal digest
    return sha1.hexdigest()

# Main program
text = input("Enter the message: ")

digest = sha1_hash(text)

print("Original Message :", text)
print("SHA-1 Message Digest :", digest)
