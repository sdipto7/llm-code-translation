
import sys
import bisect

def main():
    n = int(sys.stdin.readline())
    arr = []
    for _ in range(n):
        num = int(sys.stdin.readline())
        arr.append(num)
    
    piles = []
    for num in arr:
        idx = bisect.bisect_left(piles, num)
        if idx == 0:
            bisect.insort_left(piles, num)
        else:
            piles[idx - 1] = num
            piles.sort()
    
    print(len(piles))

if __name__ == "__main__":
    main()

