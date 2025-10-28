import sys

buf = sys.stdin.read().splitlines()
n, m = map(int, buf[0].split())
ans = []

for i in range(n):
    str_ = buf[i + 1]
    temp = []
    for j in range(m):
        if str_[j] == '-':
            temp.append('-')
        else:
            if (i + j) % 2 == 1:
                temp.append('W')
            else:
                temp.append('B')
    ans.append(''.join(temp))

for i in range(n):
    print(ans[i])
