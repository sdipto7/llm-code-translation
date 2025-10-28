
import sys
import bisect

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    L = list(map(int, data[1:1+n]))
    L.sort()
    count = 0
    for i in range(n):
        for j in range(i+1, n):
            a = L[i]
            b = L[j]
            target = a + b
            left = j + 1
            right = n - 1
            if left > right:
                continue
            pos = bisect.bisect_left(L, target, left, n)
            count += (pos - left)
    print(count)

if __name__ == "__main__":
    main()

