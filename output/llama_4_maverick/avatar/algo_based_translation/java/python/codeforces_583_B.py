
import sys

for line in sys.stdin:
    try:
        n = int(line.strip())
        a = []
        b = []
        s = -1
        for _ in range(n):
            a.append(int(sys.stdin.readline().strip()))
            b.append(0)
        tem = 1
        q = 0
        while q != n:
            s += 1
            if tem == 1:
                for i in range(n):
                    if a[i] <= q and b[i] == 0:
                        b[i] = 1
                        q += 1
                tem = 0
            else:
                for i in range(n-1, -1, -1):
                    if a[i] <= q and b[i] == 0:
                        b[i] = 1
                        q += 1
                tem = 1
        print(s)
    except ValueError:
        pass

