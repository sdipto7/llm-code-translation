

import sys
import re

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    ss = data[1:n+1]
    cc = list(data[n+1])
    c = data[n+2]
    c_ = c.upper()
    a = 'b' if c == 'a' else 'a'
    a_ = a.upper()
    m = len(cc)
    lucky = [False] * m
    
    for j in range(m):
        for i in range(n):
            l = len(ss[i])
            if m - j >= l and cc[j:j+l] == list(ss[i]):
                for h in range(l):
                    lucky[j + h] = True

    for j in range(m):
        if lucky[j]:
            if cc[j].lower() == c:
                cc[j] = a_ if cc[j].isupper() else a
            else:
                cc[j] = c_ if cc[j].isupper() else c

    print(''.join(cc))

if __name__ == "__main__":
    main()

