
import sys
str = sys.stdin.readline().strip()
c = list(str)
k = int(sys.stdin.readline().strip())
n = len(str)
for i in range(int(k)):
    if c[i] == '1':
        if i == k - 1:
            print(1)
            sys.exit()
    else:
        print(c[i])
        sys.exit()

