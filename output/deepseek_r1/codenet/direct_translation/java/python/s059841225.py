
import sys
for line in sys.stdin:
    s = line.strip().split(',')
    l = list(map(int, s[:10]))
    v1, v2 = int(s[10]), int(s[11])
    d_total = sum(l)
    t = d_total / (v1 + v2)
    current = 0
    for i in range(11):
        if v1 * t <= current:
            print(i)
            break
        current += l[i]

