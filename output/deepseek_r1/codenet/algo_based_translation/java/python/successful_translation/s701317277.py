
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    min_abs = float('inf')
    count = 0
    total = 0
    
    for num in a:
        if num < 0:
            count += 1
        current_abs = abs(num)
        min_abs = min(min_abs, current_abs)
        total += current_abs
    
    if count % 2 == 0:
        print(total)
    else:
        print(total - 2 * min_abs)

if __name__ == "__main__":
    main()

