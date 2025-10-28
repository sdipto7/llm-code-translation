
vp = float(input())
vd = float(input())
t = float(input())
f = float(input())
c = float(input())
if vd <= vp:
    print(0)
else:
    answer = 0
    start = t
    while True:
        x = (start * vp) / (vd - vp)
        if (start + x) * vp >= c:
            break
        answer += 1
        start += 2 * x + f
    print(answer)

