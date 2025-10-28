
import sys

def main():
    n = int(input().strip())
    ans = 1
    mod = 10**9 + 7
    
    for i in range(2, n + 1):
        j = 2
        while (i % j != 0 and j < i) or j == i:
            if j == i:
                s = 0
                for k in range(1, n + 1):
                    s += findS(k, i)
                ans = (ans * (s + 1)) % mod
            j += 1
    
    print(ans)

def findS(k, i):
    s = 0
    j = k
    while j % i == 0:
        s += 1
        j //= i
    return s

if __name__ == "__main__":
    main()

