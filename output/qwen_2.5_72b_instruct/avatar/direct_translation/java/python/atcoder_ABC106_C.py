
import sys

sc = sys.stdin.read().split()
str = sc[0]
c = list(str)
k = int(sc[1])
n = len(str)
for i in range(k):
    if c[i] == '1':
        if i == k - 1:
            print(1)
            sys.exit()
    else:
        print(c[i])
        sys.exit()

