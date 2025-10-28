
import sys

def main():
    import sys
    import re

    input_line = sys.stdin.readline().strip()
    strs = input_line.split()
    nums = [0] * len(strs)
    top = 0

    for s in strs:
        if s == '+':
            top -= 1
            nums[top - 1] = nums[top - 1] + nums[top]
        elif s == '-':
            top -= 1
            nums[top - 1] = nums[top - 1] - nums[top]
        elif s == '*':
            top -= 1
            nums[top - 1] = nums[top - 1] * nums[top]
        else:
            nums[top] = int(s)
            top += 1

    print(nums[0])

if __name__ == "__main__":
    main()

