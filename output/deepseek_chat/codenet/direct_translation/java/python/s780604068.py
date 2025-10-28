
def main():
    import sys
    input = sys.stdin.read
    data = list(map(int, input().split()))
    N = data[0]
    map = data[1:N*2+1]
    map.sort()
    max_sum = 0
    for i in range(0, N*2, 2):
        max_sum += min(map[i], map[i+1])
    print(max_sum)

if __name__ == "__main__":
    main()

