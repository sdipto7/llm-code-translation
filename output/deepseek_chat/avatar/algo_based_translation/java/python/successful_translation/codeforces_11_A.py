
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    d = int(data[1])
    nums = list(map(int, data[2:2+n]))
    
    result = 0
    for i in range(1, n):
        a = nums[i-1] - nums[i]
        if a >= 0:
            increment = a // d + 1
            result += increment
            nums[i] += increment * d
    
    print(result)

if __name__ == "__main__":
    main()

