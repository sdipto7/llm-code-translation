
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    A = list(map(int, data[1:1+N]))
    
    min_val = float('inf')
    count = 0
    total_sum = 0
    
    for num in A:
        if num < 0:
            count += 1
        abs_num = abs(num)
        if abs_num < min_val:
            min_val = abs_num
        total_sum += abs_num
    
    if count % 2 == 0:
        print(total_sum)
    else:
        print(total_sum - 2 * min_val)

if __name__ == "__main__":
    main()

