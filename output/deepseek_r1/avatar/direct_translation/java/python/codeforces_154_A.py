s = input().strip()
K = int(input())
res = 0
for _ in range(K):
    pair = input().strip()
    a = 0
    b = 0
    current = 0
    for c in s:
        if c == pair[0]:
            a += 1
        elif c == pair[1]:
            b += 1
        else:
            current += min(a, b)
            a = 0
            b = 0
    current += min(a, b)
    res += current
print(res)
