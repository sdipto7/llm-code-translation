n = int(input())
nums = list(map(int, input().split()))
odds = []
total = 0
for num in nums:
    if num % 2 == 0:
        total += num
    else:
        odds.append(num)
odds.sort()
total += sum(odds)
if len(odds) % 2 != 0:
    total -= odds[0]
print(total)
