
import sys

for line in sys.stdin:
    line = line.strip()
    str_arr = line.split(',')
    l = [int(num) for num in str_arr[:10]]
    d = sum(l)
    v = [int(str_arr[10]), int(str_arr[11])]
    t = d / (v[0] + v[1])
    d = 0
    for i in range(11):
        if v[0] * t <= d:
            print(i)
            break
        else:
            d += l[i]

