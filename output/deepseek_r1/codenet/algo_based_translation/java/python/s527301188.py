
strs = input().split()
nums = [0] * len(strs)
top = 0

for token in strs:
    if token in '+-*':
        top -= 1
        if token == '+':
            nums[top - 1] += nums[top]
        elif token == '-':
            nums[top - 1] -= nums[top]
        elif token == '*':
            nums[top - 1] *= nums[top]
    else:
        nums[top] = int(token)
        top += 1

print(nums[0])

