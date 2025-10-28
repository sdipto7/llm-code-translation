
import sys

def sum_digits(a):
    ans = 0
    while a >= 10:
        ans += a % 10
        a //= 10
    ans += a
    return ans

def main():
    N = int(sys.stdin.readline().strip())
    n = 0
    if N % 2 == 0:
        n = N // 2
    else:
        n = (N + 1) // 2
    
    ans = sum_digits(1) + sum_digits(N - 1)
    
    for A in range(1, n + 1):
        current_sum = sum_digits(A) + sum_digits(N - A)
        if current_sum < ans:
            ans = current_sum
    
    print(ans)

if __name__ == "__main__":
    main()

