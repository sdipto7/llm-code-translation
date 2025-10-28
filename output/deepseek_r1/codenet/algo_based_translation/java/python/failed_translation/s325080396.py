
import sys

def main():
    n = int(sys.stdin.readline())
    R = list(map(int, sys.stdin.readline().split()))[:n]
    maxv = R[1] - R[0]
    minv = R[0]
    for i in range(1, n):
        maxv = max(maxv, R[i] - minv)
        minv = min(minv, R[i])
    print(maxv)

if __name__ == "__main__":
    main()

