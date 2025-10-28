n = int(input())
s1 = 0
s2 = 0
result = []
flag = False
for _ in range(n):
    x, y = map(int, input().split())
    temp1 = s1 + x
    if abs(temp1 - s2) <= 500:
        s1 += x
        result.append('A')
        continue
    temp2 = s2 + y
    if abs(temp2 - s1) <= 500:
        s2 += y
        result.append('G')
        continue
    flag = True
    break
if flag:
    print(-1)
else:
    print(''.join(result))
