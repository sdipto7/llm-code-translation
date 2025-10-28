
import sys

def findS(k, i):
    s = 0
    while k % i == 0:
        k //= i
        s += 1
    return s

def main():
    n = int(sys.stdin.readline().strip())
    ans = 1
    mod = 10**9 + 7
    for i in range(2, n + 1):
        for j in range(2, i + 1):
            if j == i or i % j != 0:
                if j == i:
                    s = 0
                    for k in range(1, n + 1):
                        s += findS(k, i)
                    ans = (ans * (s + 1)) % mod
    print(ans)

if __name__ == "__main__":
    main()

