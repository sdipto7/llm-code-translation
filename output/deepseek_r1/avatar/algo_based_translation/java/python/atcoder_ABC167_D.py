
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    A = list(map(lambda x: int(x)-1, sys.stdin.readline().split()))
    used = set()
    idx = [-1] * N
    pos = []
    current = 0
    cur = 0
    
    while current not in used:
        used.add(current)
        idx[current] = cur
        pos.append(current)
        current = A[current]
        cur += 1
    
    a = cur - idx[current]
    b = idx[current]
    
    if K < b:
        ans = K
    else:
        ans = (K - b) % a + b
    
    print(pos[ans] + 1)

if __name__ == "__main__":
    main()

