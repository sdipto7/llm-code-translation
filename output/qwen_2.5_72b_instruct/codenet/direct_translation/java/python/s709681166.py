
s = input()
result = ''

for i in range(len(s)):
    c = s[i]
    if c.isupper():
        result += chr(ord(c) + 32)
    elif c.islower():
        result += chr(ord(c) - 32)
    else:
        result += c

print(result)

