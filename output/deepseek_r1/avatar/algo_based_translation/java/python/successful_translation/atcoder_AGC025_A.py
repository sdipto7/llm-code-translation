
def sum_digits(a):
    ans = 0
    while a >= 10:
        ans += a % 10
        a = a // 10
    ans += a
    return ans

N = int(input())
if N % 2 == 0:
    n = N // 2
else:
    n = (N + 1) // 2

ans = sum_digits(1) + sum_digits(N - 1)

for A in range(1, n + 1):
    current = sum_digits(A) + sum_digits(N - A)
    if current < ans:
        ans = current

print(ans)

