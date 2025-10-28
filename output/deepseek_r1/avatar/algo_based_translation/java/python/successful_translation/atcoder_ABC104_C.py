
import sys

def main():
    INF = 10**5
    D, G = map(int, sys.stdin.readline().split())
    p = []
    c = []
    for _ in range(D):
        pi, ci = map(int, sys.stdin.readline().split())
        p.append(pi)
        c.append(ci)
    min_solve = INF
    for bit in range(1 << D):
        score = 0
        solve_num = 0
        for i in range(D):
            if bit & (1 << i):
                score += 100 * (i + 1) * p[i] + c[i]
                solve_num += p[i]
        if score < G:
            found = False
            for i in reversed(range(D)):
                if not (bit & (1 << i)):
                    add_num = p[i] - 1
                    if add_num <= 0:
                        continue
                    for j in range(add_num):
                        score += 100 * (i + 1)
                        solve_num += 1
                        if score >= G:
                            found = True
                            break
                    if found:
                        break
        if score >= G:
            if solve_num < min_solve:
                min_solve = solve_num
    print(min_solve)

if __name__ == "__main__":
    main()

