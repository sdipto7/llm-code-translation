
import sys
from typing import List

def main():
    import sys
    from collections import defaultdict
    
    input = sys.stdin.read().split()
    n = int(input[0])
    k = int(input[1])
    a = list(map(int, input[2:2+n]))
    
    x = [0] * 200010
    for i in range(n):
        x[a[i] - 1] += 1
    
    x.sort()
    
    ans = 0
    for i in range(200010 - k):
        ans += x[i]
    
    print(ans)

if __name__ == "__main__":
    main()

