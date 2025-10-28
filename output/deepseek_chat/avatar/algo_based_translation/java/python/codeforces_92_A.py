n = int(input())
k = int(input())
i = 1
req = 1
while k - req >= 0:
    k = k - req
    i += 1
    if i % n != 0:
        req = i % n
    else:
        req = n
print(k)
