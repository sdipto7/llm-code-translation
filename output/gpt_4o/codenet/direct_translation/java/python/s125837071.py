
def findS(k, i):
    s = 0
    while k % i == 0:
        s += 1
        k //= i
    return s

def main():
    import sys
    input = sys.stdin.read
    n = int(input().strip())
    ans = 1
    mod = 10**9 + 7
    for i in range(2, n + 1):
        for j in range(2, i + 1):
            if i % j != 0 and j < i:
                continue
            if j == i:
                s = 0
                for k in range(1, n + 1):
                    s += findS(k, i)
                ans = (ans * (s + 1)) % mod
                break
    print(ans)

main()

