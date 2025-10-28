
import sys

def main():
    n = int(sys.stdin.readline().strip())
    maxv = float('-inf')
    minv = int(sys.stdin.readline().strip())
    for _ in range(1, n):
        ri = int(sys.stdin.readline().strip())
        maxv = max(maxv, ri - minv)
        minv = min(minv, ri)
    print(maxv)

if __name__ == "__main__":
    main()

