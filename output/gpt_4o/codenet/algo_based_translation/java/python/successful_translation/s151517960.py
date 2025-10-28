
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    map = {}

    index = 1
    for i in range(n):
        a = int(data[index])
        if a in map:
            map[a] += 1
        else:
            map[a] = 1
        index += 1

    ans = 0
    for key in map:
        if map[key] % 2 == 1:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()

