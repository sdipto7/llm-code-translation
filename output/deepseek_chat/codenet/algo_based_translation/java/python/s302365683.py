
import sys
from collections import defaultdict

def main():
    data = sys.stdin.read().splitlines()
    n = int(data[0].split()[0])
    arr = list(map(int, data[1].split()))
    
    hm = defaultdict(int)
    for val in arr:
        hm[val] += 1
        
    ans = 0
    for val in hm:
        num = hm[val]
        if num > val:
            ans += num - val
        elif num < val:
            ans += num
            
    print(ans)

if __name__ == "__main__":
    main()

