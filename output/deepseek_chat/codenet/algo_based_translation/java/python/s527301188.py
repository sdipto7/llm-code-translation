
import sys

def main():
    line = sys.stdin.readline().strip()
    strs = line.split()
    nums = [0] * len(strs)
    top = 0
    
    for s in strs:
        if s[0] == '+':
            top -= 1
            nums[top-1] = nums[top-1] + nums[top]
        elif s[0] == '-':
            top -= 1
            nums[top-1] = nums[top-1] - nums[top]
        elif s[0] == '*':
            top -= 1
            nums[top-1] = nums[top-1] * nums[top]
        else:
            nums[top] = int(s)
            top += 1
    
    print(nums[0])

if __name__ == "__main__":
    main()

