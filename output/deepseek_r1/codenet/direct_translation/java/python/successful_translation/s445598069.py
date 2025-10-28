
n = int(input())
nums = list(map(int, input().split()))
s = [0] * 100010

for num in nums:
    s[num] += 1

for i in range(len(s)):
    if s[i] != 0:
        s[i] = 2 if s[i] % 2 == 0 else 1

one = 0
two = 0
for num in s:
    if num == 2:
        two += 1
    elif num == 1:
        one += 1

if two % 2 != 0:
    one -= 1

print(two + one)

