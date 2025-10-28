
import sys
from collections import defaultdict

def main():
    input = sys.stdin.read
    data = input().splitlines()
    
    n = int(data[0].strip())
    numbers = map(int, data[1].strip().split())
    
    hm = defaultdict(int)
    
    for val in numbers:
        hm[val] += 1
    
    ans = 0
    for val, num in hm.items():
        if num > val:
            ans += num - val
        elif num < val:
            ans += num
    
    print(ans)

if __name__ == "__main__":
    main()

