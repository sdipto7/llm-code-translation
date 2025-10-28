
class Main:
    def __init__(self):
        pass

    def main(self):
        n, m = map(int, input().split())
        a = [0] * (m + 1)
        cnt = [0] * (n + 1)
        cnt[0] = 1
        MOD = 1000000007
        num = 1

        if m > 0:
            a_list = list(map(int, input().split()))
            for i in range(1, m + 1):
                a[i] = a_list[i - 1]

        if m > 0 and a[1] == 1:
            cnt[1] = 0
            num += 1
        else:
            cnt[1] = 1

        for i in range(2, n + 1):
            cnt[i] = (cnt[i - 2] + cnt[i - 1]) % MOD
            if m > 0 and i == a[num]:
                cnt[i] = 0
                if num < m:
                    num += 1

        print(cnt[n])

if __name__ == "__main__":
    main_obj = Main()
    main_obj.main()

