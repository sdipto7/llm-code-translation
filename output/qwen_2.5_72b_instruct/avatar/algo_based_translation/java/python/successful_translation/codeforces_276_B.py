
from collections import defaultdict

def main():
    import sys
    input = sys.stdin.read().strip()
    
    map = defaultdict(int)
    oddCount = 0
    
    for ch in input:
        map[ch] += 1
    
    for count in map.values():
        if count % 2 != 0:
            oddCount += 1
    
    if oddCount <= 1 or oddCount % 2 != 0:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()

