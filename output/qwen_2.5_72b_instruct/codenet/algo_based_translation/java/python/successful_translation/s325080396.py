
import sys

MAX = 200000

def main():
    import sys
    input = sys.stdin.read
    data = list(map(int, input().split()))
    n = data[0]
    R = data[1:n+1]
    
    maxv = R[1] - R[0]
    minv = R[0]
    
    for i in range(1, n):
        maxv = max(maxv, R[i] - minv)
        minv = min(minv, R[i])
    
    print(maxv)

if __name__ == "__main__":
    main()

