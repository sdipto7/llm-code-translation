import sys

def main():
    import math
    import sys

    startTime = sys.time()
    n = int(input())
    div = pow(10, 9) + 7
    A = list(map(int, input().split()))
    ans = 0

    for i in range(60):
        a = 0
        count1 = 0

        for j in range(n):
            if (A[j] >> i) & 1 == 1:
                count1 += 1

        a = a + count1 * (n - count1)

        for j in range(i):
            a = (a << 1) % div

        ans += a
        ans %= div

    print(ans)
    endTime = sys.time()

if __name__ == "__main__":
    main()
