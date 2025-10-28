
import sys

def solve(x, u):
    return sum(val * (1.0 if unit == 'JPY' else 380000.0) for val, unit in zip(x, u))

if __name__ == '__main__':
    n = int(sys.stdin.readline())
    x = []
    u = []
    for _ in range(n):
        parts = sys.stdin.readline().split()
        x.append(float(parts[0]))
        u.append(parts[1])
    print(solve(x, u))

