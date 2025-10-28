
import sys
import math

def gcd(a, b):
    if b > a:
        tmp = a
        a = b
        b = tmp
    if b == 0:
        return a
    r = -1
    while True:
        r = a % b
        a = b
        b = r
        if r == 0:
            break
    return a

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    A = list(map(int, data[1:1+N]))
    
    L = [0] * N
    R = [0] * N
    
    L[0] = A[0]
    for i in range(1, N):
        L[i] = gcd(L[i-1], A[i])
    
    R[N-1] = A[N-1]
    for i in range(N-2, -1, -1):
        R[i] = gcd(R[i+1], A[i])
    
    answer = max(L[N-2], R[1])
    for i in range(1, N-1):
        current_gcd = gcd(L[i-1], R[i+1])
        answer = max(answer, current_gcd)
    
    print(answer)

if __name__ == "__main__":
    main()

