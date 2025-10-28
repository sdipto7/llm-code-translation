
def main():
    import sys
    import math

    input = sys.stdin.read().split()
    n = int(input[0])
    d = int(input[1])
    nums = list(map(int, input[2:2+n]))

    result = 0
    a = 0
    for i in range(1, n):
        a = nums[i-1] - nums[i]
        if a >= 0:
            result += a // d + 1
            nums[i] += (a // d + 1) * d

    print(result)

if __name__ == "__main__":
    main()

