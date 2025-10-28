
from collections import defaultdict

def main():
    n = int(input())
    map = defaultdict(int)
    for _ in range(n):
        a = int(input().split()[0])
        map[a] += 1
    ans = sum(val % 2 for val in map.values())
    print(ans)

if __name__ == "__main__":
    main()

