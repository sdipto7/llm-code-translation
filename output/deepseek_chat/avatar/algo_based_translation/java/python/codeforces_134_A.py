
import sys

def main():
    n = int(input().strip())
    arr = []
    total_sum = 0
    for _ in range(n):
        num = int(input().strip())
        arr.append(num)
        total_sum += num
    
    count = 0
    result_indices = []
    
    for i in range(n):
        if (total_sum - arr[i]) % (n - 1) == 0 and (total_sum - arr[i]) // (n - 1) == arr[i]:
            count += 1
            result_indices.append(str(i + 1))
    
    print(count)
    print(' '.join(result_indices))

if __name__ == "__main__":
    main()

