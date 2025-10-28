
import sys

input = sys.stdin.read().split()
n = int(input[0])
ch = [''] * n
s1 = 0
s2 = 0
j = 0
flag = 0

for i in range(n):
    x = int(input[2 * i + 1])
    y = int(input[2 * i + 2])
    temp1 = s1 + x
    temp2 = s2 + y
    if abs(temp1 - s2) <= 500:
        s1 += x
        ch[j] = 'A'
        j += 1
        continue
    if abs(temp2 - s1) <= 500:
        s2 += y
        ch[j] = 'G'
        j += 1
        continue
    flag = 1
    break

if flag == 1:
    print(-1)
else:
    print(''.join(ch))

