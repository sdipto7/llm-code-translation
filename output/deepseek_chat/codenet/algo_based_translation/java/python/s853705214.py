
import sys

def main():
    n = int(input().strip())
    nums = []
    for _ in range(n):
        nums.append(int(input().strip()))
    
    min_val = float('inf')
    count_negatives = 0
    total_sum = 0
    
    for num in nums:
        abs_val = abs(num)
        total_sum += abs_val
        if abs_val < min_val:
            min_val = abs_val
        if num < 0:
            count_negatives += 1
    
    if count_negatives % 2 == 0:
        print(total_sum)
    else:
        print(total_sum - (min_val * 2))

if __name__ == "__main__":
    main()

