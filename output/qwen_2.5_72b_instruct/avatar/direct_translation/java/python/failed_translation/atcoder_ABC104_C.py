
import sys

INF = 100000
input = sys.stdin.read().split()
D = int(input[0])
G = int(input[1])
p = list(map(int, input[2:2+D]))
c = list(map(int, input[2+D:2+2*D]))

min_val = INF
for bit in range(1 << D):
    score = 0
    solve_num = 0
    for i in range(D):
        if bit & (1 << i):
            score += 100 * (i + 1) * p[i] + c[i]
            solve_num += p[i]
    if score < G:
        for i in range(D - 1, -1, -1):
            if not (bit & (1 << i)):
                for j in range(p[i] - 1):
                    score += 100 * (i + 1)
                    solve_num += 1
                    if score >= G:
                        break
                if score >= G:
                    break
    if score >= G:
        min_val = min(min_val, solve_num)

print(min_val)

