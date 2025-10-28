
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    nums = list(map(int, data[1:n+1]))
    
    min_value = float('inf')
    count_negatives = 0
    total_sum = 0
    
    for num in nums:
        abs_num = abs(num)
        total_sum += abs_num
        min_value = min(min_value, abs_num)
        if num < 0:
            count_negatives += 1
    
    if count_negatives % 2 == 0:
        print(total_sum)
    else:
        print(total_sum - (min_value * 2))

if __name__ == "__main__":
    main()

