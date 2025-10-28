
import sys

INF = 100000

def main():
    D = int(sys.stdin.readline())
    G = int(sys.stdin.readline())
    p = []
    c = []
    for _ in range(D):
        p.append(int(sys.stdin.readline()))
        c.append(int(sys.stdin.readline()))
    min_val = INF
    for bit in range(1 << D):
        score = 0
        solve_num = 0
        for i in range(D):
            if (bit & (1 << i)) != 0:
                score += 100 * (i + 1) * p[i] + c[i]
                solve_num += p[i]
        if score < G:
            for i in range(D - 1, -1, -1):
                if (bit & (1 << i)) == 0:
                    for j in range(p[i] - 1):
                        score += 100 * (i + 1)
                        solve_num += 1
                        if score >= G:
                            break
                    else:
                        continue
                    break
        if score >= G:
            min_val = min(min_val, solve_num)
    print(min_val)

if __name__ == "__main__":
    main()

