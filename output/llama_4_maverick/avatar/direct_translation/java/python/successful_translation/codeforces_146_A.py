
import sys
n = int(sys.stdin.readline().strip())
s = sys.stdin.readline().strip()
t = 0
for c in s:
    if c not in ['4', '7']:
        t = 1
if t == 1:
    print("NO")
else:
    x = sum(int(c) for c in s[:n//2])
    y = sum(int(c) for c in s[n//2:])
    if x == y:
        print("YES")
    else:
        print("NO")

