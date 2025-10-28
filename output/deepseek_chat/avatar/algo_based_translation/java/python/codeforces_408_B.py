
import sys
from collections import defaultdict

def main():
    s1 = input().strip()
    s2 = input().strip()
    
    if not is_valid(s1, s2):
        print(-1)
    else:
        m1 = defaultdict(int)
        m2 = defaultdict(int)
        
        for c in s1:
            m1[c] += 1
            
        for c in s2:
            m2[c] += 1
            
        ans = 0
        hs = set()
        
        for c in s2:
            if c not in hs:
                hs.add(c)
                x1 = m1[c]
                x2 = m2[c]
                min_count = min(x1, x2)
                ans += min_count
                
        print(ans)

def is_valid(s1, s2):
    char_set = set()
    for c in s1:
        char_set.add(c)
    
    for c in s2:
        if c not in char_set:
            return False
            
    return True

if __name__ == "__main__":
    main()

