
n, k = map(int, input().split())
arr = list(map(int, input().split()))
res = []
o = arr.count(1)
e = n - o
for _ in range(k):
    l, r = map(int, input().split())
    length = r - l + 1
    if length % 2 == 1:
        res.append("0")
    else:
        half = length // 2
        if half <= o and half <= e:
            res.append("1")
        else:
            res.append("0")
print("\n".join(res))

