
def main():
    import sys

    input = sys.stdin.read().split()
    idx = 0

    n = int(input[idx])
    idx += 1
    k = int(input[idx])
    idx += 1

    arr = list(map(int, input[idx:idx+n]))
    idx += n

    res = []
    o = 0
    e = 0

    for i in range(n):
        if arr[i] == 1:
            o += 1
        else:
            e += 1

    for _ in range(k):
        l = int(input[idx]) - 1
        idx += 1
        r = int(input[idx]) - 1
        idx += 1

        if (r - l + 1) % 2 == 1:
            res.append("0\n")
        else:
            if (r - l + 1) // 2 <= o and (r - l + 1) // 2 <= e:
                res.append("1\n")
            else:
                res.append("0\n")

    print("".join(res))

if __name__ == "__main__":
    main()

