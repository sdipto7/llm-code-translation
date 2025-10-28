
def main():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        quotient = n // i
        ans += i * quotient * (quotient + 1) // 2
    print(ans)

if __name__ == "__main__":
    main()

