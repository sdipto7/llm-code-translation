
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    A = list(map(int, data[1:N+1]))
    
    A.sort()

    min_val = A[0]
    max_val = A[-1]
    
    mins = 0
    maxs = 0
    
    for value in A:
        if value == min_val:
            mins += 1
        if value == max_val:
            maxs += 1
    
    if min_val == max_val:
        pairs = mins * (mins - 1) // 2
        print(f"0 {pairs}")
    else:
        difference = max_val - min_val
        pairs = mins * maxs
        print(f"{difference} {pairs}")

if __name__ == "__main__":
    main()

