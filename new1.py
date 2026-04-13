# Only demonstration (simplified)

def left_shift(bits, shifts):
    return bits[shifts:] + bits[:shifts]

key = "101010101100110011011101"

left = key[:28]
right = key[28:]

left = left_shift(left, 1)
right = left_shift(right, 1)

key1 = left + right
print("Key1:", key1)