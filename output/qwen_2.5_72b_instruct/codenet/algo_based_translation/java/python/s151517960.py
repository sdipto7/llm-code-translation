from collections import defaultdict

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    map = defaultdict(int)
    index = 1
    for i in range(n):
        a = int(data[index])
        index += 1
        if a in map:
            map[a] += 1
        else:
            map[a] = 1
    ans = 0
    for key in map:
        if map[key] % 2 == 1:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
