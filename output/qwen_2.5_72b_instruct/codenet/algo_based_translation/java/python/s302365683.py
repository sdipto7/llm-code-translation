
import sys
from collections import defaultdict

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read().splitlines()
    n = int(input[0])
    hm = defaultdict(int)
    values = list(map(int, input[1].split()))
    
    for val in values:
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

