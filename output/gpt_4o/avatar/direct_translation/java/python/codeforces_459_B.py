
import sys
from collections import Counter

def main():
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    A = list(map(int, data[1:]))
    
    A.sort()
    min_val = A[0]
    max_val = A[-1]
    
    count = Counter(A)
    mins = count[min_val]
    maxs = count[max_val]
    
    if min_val == max_val:
        print(f"{max_val - min_val} {mins * (mins - 1) // 2}")
    else:
        print(f"{max_val - min_val} {mins * maxs}")

if __name__ == "__main__":
    main()

