
import sys
from collections import deque

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    K = int(data[1])
    A = list(map(int, data[2:2+N]))
    A = [x - 1 for x in A]
    
    used = set()
    idx = [-1] * N
    pos = [-1] * N
    next_val = 0
    cur = 0
    
    while next_val not in used:
        used.add(next_val)
        idx[next_val] = cur
        pos[cur] = next_val
        next_val = A[next_val]
        cur += 1
    
    a = cur - idx[next_val]
    b = idx[next_val]
    
    if b > K:
        ans = int(K)
    else:
        ans = int((10000 * a + K - b) % a + b)
    
    print(pos[ans] + 1)

if __name__ == "__main__":
    main()

