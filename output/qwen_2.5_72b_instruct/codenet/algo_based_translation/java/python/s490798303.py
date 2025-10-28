
import sys

def main():
    import sys
    import sys
    from collections import defaultdict
    
    input = sys.stdin.read().split()
    index = 0
    
    n = int(input[index])
    index += 1
    k = int(input[index])
    index += 1
    
    map = defaultdict(list)
    
    for _ in range(k):
        d = int(input[index])
        index += 1
        for _ in range(d):
            person = int(input[index])
            index += 1
            map[person].append(d)
    
    count = 0
    for i in range(1, n + 1):
        if i not in map:
            count += 1
    
    print(count)

if __name__ == "__main__":
    main()

