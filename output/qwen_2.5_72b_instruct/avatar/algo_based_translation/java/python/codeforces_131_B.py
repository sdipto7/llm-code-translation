
import sys

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read().split()
    n = int(input[0])
    cnt = [0] * 21
    index = 1

    for i in range(n):
        num = int(input[index]) + 10
        cnt[num] += 1
        index += 1

    res = 0
    for i in range(10):
        res += cnt[i] * cnt[20 - i]

    res += (cnt[10] * (cnt[10] - 1)) // 2

    print(res)

if __name__ == "__main__":
    main()

