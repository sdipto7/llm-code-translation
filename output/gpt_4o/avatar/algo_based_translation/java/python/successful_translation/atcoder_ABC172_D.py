
def main():
    import sys
    input = sys.stdin.read
    n = int(input().strip())
    ans = 0
    for i in range(1, n + 1):
        temp = n // i
        ans += i * temp * (temp + 1) // 2
    print(ans)

if __name__ == "__main__":
    main()

