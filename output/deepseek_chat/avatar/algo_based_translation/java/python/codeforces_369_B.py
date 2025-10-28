
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    l = int(data[2])
    r = int(data[3])
    sAll = int(data[4])
    sk = int(data[5])
    ans = getPoints(n, k, l, r, sAll, sk)
    print(' '.join(map(str, ans)))

def getPoints(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= sk + (n - k) * l
    sk -= k * l
    
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            sk -= 1
    
    while sAll > 0:
        idx = 0
        while sAll > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            sAll -= 1
    
    return ans

if __name__ == "__main__":
    main()

