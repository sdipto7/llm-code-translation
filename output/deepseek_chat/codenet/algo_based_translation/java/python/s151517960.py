
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline().strip())
    freq_map = defaultdict(int)
    for _ in range(n):
        a = int(sys.stdin.readline().strip())
        freq_map[a] += 1
    
    ans = 0
    for count in freq_map.values():
        if count % 2 == 1:
            ans += 1
            
    print(ans)

if __name__ == "__main__":
    main()

