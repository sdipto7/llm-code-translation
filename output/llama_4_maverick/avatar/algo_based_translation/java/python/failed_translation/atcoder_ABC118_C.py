def main():
    n = int(input())
    if n == 1:
        print(int(input()))
        return
    nums = []
    for _ in range(n):
        nums.append(int(input()))
    nums.sort()
    if nums[-1] == 0:
        print(0)
        return
    ans = 0
    while True:
        if len(nums) == 1:
            ans = nums[0]
            break
        nums = process_list(nums)
    print(ans)

def process_list(nums):
    nums = [num for num in nums if num != 0]
    min_val = min(nums)
    for i in range(len(nums)):
        nums[i] %= min_val
        if nums[i] == 1:
            print(1)
            exit()
    nums.sort()
    return nums

if __name__ == "__main__":
    main()
