
n, k = map(int, input().split())
i = 1
while k - i >= 0:
    k -= i
    i += 1
    if i % n != 0:
        i = i % n
    else:
        i = n
print(k)

