
import sys

def main():
    n = int(sys.stdin.readline())
    ans = 0
    for i in range(1, n + 1):
        term = i * (n // i) * ((n // i) + 1) // 2
        ans += term
    print(ans)

if __name__ == "__main__":
    main()

