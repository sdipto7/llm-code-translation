n, k = map(int, input().split())
arr = list(map(int, input().split()))
o, e = 0, 0
for num in arr:
    if num == 1:
        o += 1
    else:
        e += 1
res = []
for _ in range(k):
    l, r = map(int, input().split())
    length = r - l + 1
    if length % 2 == 1:
        res.append('0')
    else:
        if length // 2 <= o and length // 2 <= e:
            res.append('1')
        else:
            res.append('0')
print('\n'.join(res))
