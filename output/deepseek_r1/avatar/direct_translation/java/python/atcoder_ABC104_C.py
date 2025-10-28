
D, G = map(int, input().split())
p = []
c = []
for _ in range(D):
    a, b = map(int, input().split())
    p.append(a)
    c.append(b)

min_val = float('inf')

for bit in range(1 << D):
    score = 0
    solve_num = 0
    for i in range(D):
        if bit & (1 << i):
            score += 100 * (i + 1) * p[i] + c[i]
            solve_num += p[i]
    if score >= G:
        if solve_num < min_val:
            min_val = solve_num
        continue
    for i in reversed(range(D)):
        if not (bit & (1 << i)):
            max_take = p[i] - 1
            if max_take <= 0:
                continue
            each = 100 * (i + 1)
            needed = G - score
            take = min((needed + each - 1) // each, max_take)
            if take > 0:
                score += take * each
                solve_num += take
                if score >= G:
                    break
    if score >= G and solve_num < min_val:
        min_val = solve_num

print(min_val)

