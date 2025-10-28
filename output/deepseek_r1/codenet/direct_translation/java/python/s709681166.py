s = input()
result = []
for c in s:
    if c.isupper():
        result.append(chr(ord(c) + 32))
    elif c.islower():
        result.append(chr(ord(c) - 32))
    else:
        result.append(c)
print(''.join(result))
