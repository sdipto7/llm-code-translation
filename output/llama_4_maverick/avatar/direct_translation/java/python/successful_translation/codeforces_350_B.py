
import sys
n = int(sys.stdin.readline().strip())
a = [0] + list(map(int, sys.stdin.readline().strip().split()))
b = [0] + list(map(int, sys.stdin.readline().strip().split()))
num = [0] * (n + 1)
for i in range(1, n + 1):
    num[b[i]] += 1
ss = ""
ans = 0
st = [False] * (n + 1)
for i in range(1, n + 1):
    if a[i] == 1:
        st[i] = True
        sb = []
        x = b[i]
        sss = str(i)
        sb.append(sss)
        s = 1
        while not st[x] and num[x] == 1 and x != 0 and a[x] != 1:
            sss = str(x)
            sb.append(sss)
            st[x] = True
            x = b[x]
            s += 1
        if s > ans:
            ans = s
            ss = ' '.join(reversed(sb))
print(ans)
print(ss)

