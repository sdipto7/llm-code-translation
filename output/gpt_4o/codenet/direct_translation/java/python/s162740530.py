
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    m = int(data[1])
    a = [0] * (m + 1)
    cnt = [0] * (n + 1)
    cnt[0] = 1
    MOD = 1000000007

    for i in range(1, m + 1):
        a[i] = int(data[i + 1])

    num = 1
    if m > 0:
        if a[1] == 1:
            cnt[1] = 0
            if num < m:
                num += 1
        else:
            cnt[1] = 1
    else:
        cnt[1] = 1

    for i in range(2, n + 1):
        cnt[i] = cnt[i - 2] + cnt[i - 1]
        cnt[i] %= MOD
        if m > 0:
            if i == a[num]:
                cnt[i] = 0
                if num < m:
                    num += 1

    print(cnt[n])

main()

