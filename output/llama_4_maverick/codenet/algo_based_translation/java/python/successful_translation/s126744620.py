
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))
    x = [0] * 200010
    for num in a:
        x[num - 1] += 1
    x.sort()
    ans = sum(x[:200010 - k])
    print(ans)

if __name__ == "__main__":
    main()

