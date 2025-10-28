
n = int(input())
s = input().strip()
c = list(s)
for i in range(len(c)):
    c[i] = chr((ord(c[i]) - ord('A') + n) % 26 + ord('A'))
print(''.join(c))

