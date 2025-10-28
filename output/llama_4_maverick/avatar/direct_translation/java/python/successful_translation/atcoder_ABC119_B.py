
def main():
    N = int(input())
    x = []
    u = []
    for _ in range(N):
        a, b = input().split()
        x.append(float(a))
        u.append(b)
    print(solve(x, u))

def solve(x, u):
    return sum(i * (380000 if j == 'BTC' else 1) for i, j in zip(x, u))

if __name__ == "__main__":
    main()

