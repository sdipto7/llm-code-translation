
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    A = list(map(int, data[1:1+N]))
    
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
        print(f"{max_val - min_val} {mins * (mins - 1) // 2}")
    else:
        print(f"{max_val - min_val} {mins * maxs}")

if __name__ == "__main__":
    main()

