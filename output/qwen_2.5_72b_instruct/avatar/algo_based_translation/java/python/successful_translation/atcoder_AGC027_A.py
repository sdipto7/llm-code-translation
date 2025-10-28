
from typing import List

def main():
    import sys
    import re
    
    input = sys.stdin.read().split()
    index = 0
    
    N = int(input[index])
    index += 1
    x = int(input[index])
    index += 1
    
    sweet: List[int] = []
    for _ in range(N):
        a = int(input[index])
        index += 1
        sweet.append(a)
    
    sweet.sort()
    
    num = 0
    for i in range(N):
        if x - sweet[num] >= 0:
            x -= sweet[num]
            num += 1
        else:
            break
    
    if num == N and x > 0:
        num -= 1
    
    print(num)

if __name__ == "__main__":
    main()

