import math

def main():
    N = int(input())
    x = []
    y = []
    for _ in range(N):
        xi, yi = map(int, input().split())
        x.append(xi)
        y.append(yi)

    for i in range(N):
        thetas = []
        for j in range(N):
            if i == j:
                continue
            thetas.append(math.atan2(y[j] - y[i], x[j] - x[i]))
        thetas.sort()
        thetas.append(thetas[0] + 2 * math.pi)
        ans = 0
        for k in range(len(thetas) - 1):
            ans = max(ans, thetas[k + 1] - thetas[k] - math.pi)
        print(ans / (2 * math.pi))

if __name__ == "__main__":
    main()
