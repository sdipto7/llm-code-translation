
MOD = 10**9 + 7

s = input().strip()
prev = [0] * 13
prev[0] = 1
base = 1

for c in reversed(s):
    curr = [0] * 13
    if c == '?':
        for d in range(10):
            for r in range(13):
                if prev[r]:
                    new_r = (d * base + r) % 13
                    curr[new_r] = (curr[new_r] + prev[r]) % MOD
    else:
        d = int(c)
        for r in range(13):
            if prev[r]:
                new_r = (d * base + r) % 13
                curr[new_r] = (curr[new_r] + prev[r]) % MOD
    prev = curr
    base = (base * 10) % 13

print(prev[5])

