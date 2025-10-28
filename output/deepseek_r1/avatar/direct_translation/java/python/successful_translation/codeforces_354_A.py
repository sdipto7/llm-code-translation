N, L, R, QL, QR = map(int, input().split())
W = list(map(int, input().split()))

prefix = [0]
for w in W:
    prefix.append(prefix[-1] + w)

min_cost = float('inf')
for lCount in range(N + 1):
    rCount = N - lCount
    cost = prefix[lCount] * L + (prefix[-1] - prefix[lCount]) * R
    ll = max(0, lCount - rCount - 1)
    rr = max(0, rCount - lCount - 1)
    cost += ll * QL + rr * QR
    if cost < min_cost:
        min_cost = cost

print(min_cost)
