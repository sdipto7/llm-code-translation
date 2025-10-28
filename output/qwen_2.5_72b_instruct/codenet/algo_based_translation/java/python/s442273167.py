
def main():
    import sys
    input = sys.stdin.read
    data = list(map(int, input().split()))
    n = data[0]
    l = data[1::2]
    r = data[2::2]
    sum = 0
    for i in range(n):
        sum += r[i] - l[i] + 1
    print(sum)

if __name__ == "__main__":
    main()

