
import sys
from typing import List

def main():
    import sys
    from typing import List
    import math
    INF = int(1e9) + 5
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    a: List[int] = []
    b: List[int] = []
    left = INF
    right = 0
    
    index = 1
    for i in range(n):
        a.append(int(data[index]))
        b.append(int(data[index + 1]))
        left = min(left, a[i])
        right = max(right, b[i])
        index += 2
    
    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 1)
            return
    
    print(-1)

if __name__ == "__main__":
    main()

