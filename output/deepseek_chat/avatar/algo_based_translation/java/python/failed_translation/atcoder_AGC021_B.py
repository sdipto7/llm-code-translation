
import math
import sys

def main():
    data = sys.stdin.read().split()
    idx = 0
    N = int(data[idx]); idx += 1
    x = [0] * N
    y = [0] * N
    for i in range(N):
        x[i] = int(data[idx]); idx += 1
        y[i] = int(data[idx]); idx += 1
    
    for i in range(N):
        thetas = []
        for j in range(N):
            if i == j:
                continue
            angle = math.atan2(y[j] - y[i], x[j] - x[i])
            thetas.append(angle)
        thetas.sort()
        thetas.append(thetas[0] + 2 * math.pi)
        ans = 0.0
        for k in range(N - 1):
            gap = thetas[k + 1] - thetas[k] - math.pi
            if gap > ans:
                ans = gap
        print(ans / (2 * math.pi))

if __name__ == "__main__":
    main()

