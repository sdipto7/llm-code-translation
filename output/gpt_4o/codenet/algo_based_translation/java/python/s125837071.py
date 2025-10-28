
def main():
    import sys
    input = sys.stdin.read
    data = input().strip()
    
    n = int(data)
    ans = 1
    mod = 1000000007
    
    def findS(k, i):
        s = 0
        j = k
        while j % i == 0:
            j //= i
            s += 1
        return s
    
    for i in range(2, n + 1):
        for j in range(2, i + 1):
            if (i % j != 0 and j < i) or j == i:
                if j == i:
                    s = 0
                    for k in range(1, n + 1):
                        s += findS(k, i)
                    ans = (ans * (s + 1)) % mod
    print(ans)

if __name__ == "__main__":
    main()

