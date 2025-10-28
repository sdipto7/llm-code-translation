
import sys
input = sys.stdin.read
data = input().split()
N = int(data[0])
words = data[1:]
ans = True
past = set()
next = ""
for i in range(N):
    if words[i] in past:
        ans = False
        break
    past.add(words[i])
    if i != 0:
        if next != words[i][0]:
            ans = False
            break
    next = words[i][-1]
print("Yes" if ans else "No")

