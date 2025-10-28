
def sum_of_digits(a):
    ans = 0
    while a >= 10:
        ans += a % 10
        a //= 10
    ans += a
    return ans

def main():
    N = int(input())
    n = 0
    if N % 2 == 0:
        n = N // 2
    else:
        n = (N + 1) // 2
    ans = sum_of_digits(1) + sum_of_digits(N - 1)
    for A in range(1, n + 1):
        if sum_of_digits(A) + sum_of_digits(N - A) < ans:
            ans = sum_of_digits(A) + sum_of_digits(N - A)
    print(ans)

main()

