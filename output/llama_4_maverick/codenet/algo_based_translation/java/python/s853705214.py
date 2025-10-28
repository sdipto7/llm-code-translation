
import sys

def read_input():
    n = int(sys.stdin.readline().strip())
    nums = list(map(int, sys.stdin.readline().strip().split()))
    if len(nums) != n:
        nums = []
        for _ in range(n):
            nums.append(int(sys.stdin.readline().strip()))
    return nums

def process_numbers(nums):
    min_val = float('inf')
    count_negatives = 0
    total_sum = 0
    for num in nums:
        abs_num = abs(num)
        total_sum += abs_num
        min_val = min(min_val, abs_num)
        if num < 0:
            count_negatives += 1
    if count_negatives % 2 == 0:
        return total_sum
    else:
        return total_sum - (min_val * 2)

def main():
    nums = read_input()
    result = process_numbers(nums)
    print(result)

if __name__ == "__main__":
    main()

