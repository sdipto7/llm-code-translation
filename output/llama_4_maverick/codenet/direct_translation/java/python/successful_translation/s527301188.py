
import sys

def main():
    strs = sys.stdin.readline().strip().split(" ")
    nums = []
    for s in strs:
        if s[0] in ['+', '-', '*']:
            b = nums.pop()
            a = nums.pop()
            if s[0] == '+':
                nums.append(a + b)
            elif s[0] == '-':
                nums.append(a - b)
            else:
                nums.append(a * b)
        else:
            nums.append(int(s))
    print(nums[0])

if __name__ == "__main__":
    main()

