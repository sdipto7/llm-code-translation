
s = input()
for c in s:
    if c.isupper():
        print(chr(ord(c) + 32), end='')
    elif c.islower():
        print(chr(ord(c) - 32), end='')
    else:
        print(c, end='')
print()

