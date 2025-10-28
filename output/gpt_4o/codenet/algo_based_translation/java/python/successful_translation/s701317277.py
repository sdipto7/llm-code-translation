
import sys

def main():
    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    A = list(map(int, data[1:N+1]))
    
    min_value = float('inf')
    count = 0
    total_sum = 0
    
    for value in A:
        if value < 0:
            count += 1
        abs_value = abs(value)
        min_value = min(min_value, abs_value)
        total_sum += abs_value
    
    if count % 2 == 0:
        print(total_sum)
    else:
        print(total_sum - min_value * 2)

if __name__ == "__main__":
    main()

