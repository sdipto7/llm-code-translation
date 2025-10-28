n, k = map(int, input().split())
i, req = 1, 1
while k >= req:
    k -= req
    i += 1
    req = i % n if i % n != 0 else n
print(k)
