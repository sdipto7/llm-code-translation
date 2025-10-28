
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    x = []
    u = []
    for i in range(N):
        x.append(float(input[2 * i + 1]))
        u.append(input[2 * i + 2])
    print(solve(x, u))

def solve(x, u):
    return sum(x[i] * (1 if u[i] == "JPY" else 380000) for i in range(len(x)))

if __name__ == "__main__":
    main()

