
mod = 998244353
nchoosek = [[0] * 4001 for _ in range(4001)]
for i in range(4001):
    nchoosek[i][0] = 1
    nchoosek[i][i] = 1
for i in range(2, 4001):
    for j in range(1, i):
        nchoosek[i][j] = (nchoosek[i-1][j] + nchoosek[i-1][j-1]) % mod

k, n = map(int, input().split())

for i in range(2, 2*k + 1):
    if i > k:
        pair = k - i // 2
    else:
        pair = (i - 1) // 2
    active = k - 2 * pair
    if i % 2 == 0:
        active -= 1
    times2 = 1
    total = 0
    for j in range(pair + 1):
        choice = (times2 * nchoosek[pair][j]) % mod
        times2 = (times2 * 2) % mod
        if active + j - 1 < 0:
            continue
        term = nchoosek[n + active - 1][active + j - 1]
        if i % 2 == 0:
            term = (term + nchoosek[n + active - 2][active + j - 1]) % mod
        total = (total + choice * term) % mod
    print(total)

