
import sys
from collections import defaultdict

def main():
    reader = sys.stdin
    input_line = reader.readline().strip().split()
    m = int(input_line[1])
    s = int(input_line[2])
    f = int(input_line[3])
    maxT = -1
    map = defaultdict(list)
    
    for _ in range(m):
        mth = reader.readline().strip().split()
        k = int(mth[0])
        map[k].append(int(mth[1]))
        map[k].append(int(mth[2]))
        maxT = max(maxT, k)
    
    actions = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s
    a, b = -1, -1
    
    for t in range(1, maxT + 1):
        if t in map:
            a, b = map[t][0], map[t][1]
        
        if t in map and ((cur >= a and cur <= b) or (cur + d >= a and cur + d <= b)):
            actions.append('X')
        else:
            actions.append(M)
            cur += d
        
        if cur == f:
            break
    
    while cur != f:
        actions.append(M)
        cur += d
    
    print(''.join(actions))

if __name__ == "__main__":
    main()

