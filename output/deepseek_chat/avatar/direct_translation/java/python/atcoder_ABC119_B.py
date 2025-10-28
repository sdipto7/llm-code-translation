
import sys

def solve(x, u):
    return sum(x[i] * (1 if u[i] == 'JPY' else 380000) for i in range(len(x)))

def main():
    N = int(sys.stdin.readline())
    x = []
    u = []
    for _ in range(N):
        xi, ui = sys.stdin.readline().split()
        x.append(float(xi))
        u.append(ui)
    print(solve(x, u))

if __name__ == "__main__":
    main()

