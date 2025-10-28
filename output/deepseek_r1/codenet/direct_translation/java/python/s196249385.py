
n, k = map(int, input().split())
a = list(map(int, input().split()))

cumsum = [0] * (n + 1)
for i in range(n):
    cumsum[i + 1] = cumsum[i] + a[i]

b = []
for i in range(n):
    for j in range(i, n):
        b.append(cumsum[j + 1] - cumsum[i])

current = b.copy()
max_val = max(current) if current else 0
mask = 1 << (max_val.bit_length() - 1) if max_val != 0 else 0

while mask > 0:
    temp = [x for x in current if (x & mask) != 0]
    if len(temp) >= k:
        current = temp
    mask >>= 1

if len(current) >= k:
    ans = -1
    for num in current:
        ans &= num
    print(ans)
else:
    print(0)

