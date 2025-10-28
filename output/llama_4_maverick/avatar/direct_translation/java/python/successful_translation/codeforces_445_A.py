
import sys
(n, m) = map(int, input().split())
ans = []
for i in range(n):
    s = input()
    temp = ''
    for j in range(m):
        if s[j] == '-':
            temp += '-'
        else:
            temp += 'W' if (i + j) % 2 == 1 else 'B'
    ans.append(temp)
for i in ans:
    print(i)

