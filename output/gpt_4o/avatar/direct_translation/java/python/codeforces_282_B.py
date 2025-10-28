
n = int(input())
ch = [''] * n
s1 = 0
s2 = 0
flag = 0

for i in range(n):
    x, y = map(int, input().split())
    temp1 = s1 + x
    temp2 = s2 + y
    if abs(temp1 - s2) <= 500:
        s1 += x
        ch[i] = 'A'
        continue
    if abs(temp2 - s1) <= 500:
        s2 += y
        ch[i] = 'G'
        continue
    flag = 1
    break

if flag == 1:
    print(-1)
else:
    ans = ''.join(ch)
    print(ans)

