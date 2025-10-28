import sys

def main():
    MAX = 200000
    R = [0] * MAX
    n = int(input().strip())
    values = list(map(int, input().split()))
    for i in range(n):
        R[i] = values[i]
    
    maxv = R[1] - R[0]
    minv = R[0]
    
    for i in range(1, n):
        maxv = max(maxv, R[i] - minv)
        minv = min(minv, R[i])
    
    print(maxv)

if __name__ == "__main__":
    main()
