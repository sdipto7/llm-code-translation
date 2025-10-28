n, k = map(int, input().split())
arr = list(map(int, input().split()))
o = sum(1 for x in arr if x % 2 != 0)
e = len(arr) - o
res = []
for _ in range(k):
    l, r = map(int, input().split())
    length = r - l + 1
    if length % 2:
        res.append('0')
    else:
        req = length // 2
        res.append('1' if o >= req and e >= req else '0')
print('\n'.join(res))
