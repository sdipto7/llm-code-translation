
import sys

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    cnt = [0] * 5
    for i in range(1, n + 1):
        str = input[i]
        if str[0] == 'M':
            cnt[0] += 1
        elif str[0] == 'A':
            cnt[1] += 1
        elif str[0] == 'R':
            cnt[2] += 1
        elif str[0] == 'C':
            cnt[3] += 1
        elif str[0] == 'H':
            cnt[4] += 1
    res = cnt[0] * cnt[1] * cnt[2] + cnt[0] * cnt[1] * cnt[3] + cnt[0] * cnt[1] * cnt[4] + cnt[0] * cnt[2] * cnt[3] + cnt[0] * cnt[2] * cnt[4] + cnt[0] * cnt[3] * cnt[4] + cnt[1] * cnt[2] * cnt[3] + cnt[1] * cnt[2] * cnt[4] + cnt[1] * cnt[3] * cnt[4] + cnt[2] * cnt[3] * cnt[4]
    print(res)

if __name__ == "__main__":
    main()

