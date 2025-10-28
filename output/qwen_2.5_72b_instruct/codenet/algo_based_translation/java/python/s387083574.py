
import sys
from collections import defaultdict

def main():
    import sys
    from collections import defaultdict
    from operator import itemgetter

    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    map = {}
    
    for i in range(1, N + 1):
        map[i] = int(data[i])
    
    sorted_keys = sorted(map, key=lambda k: map[k])
    result = ' '.join(map(str, sorted_keys))
    print(result)

if __name__ == "__main__":
    main()

