
n = int(input())
s1 = 0
s2 = 0
ch = []
flag = False

for _ in range(n):
    x, y = map(int, input().split())
    temp1 = s1 + x
    temp2 = s2 + y
    
    if abs(temp1 - s2) <= 500:
        s1 += x
        ch.append('A')
        continue
    if abs(temp2 - s1) <= 500:
        s2 += y
        ch.append('G')
        continue
    
    flag = True
    break

print(-1 if flag else ''.join(ch))

