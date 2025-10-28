
n = int(input())
nums = list(map(int, input().split()))[:n]
sum_total = 0
odd = []
for num in nums:
    if num % 2 == 0:
        sum_total += num
    else:
        odd.append(num)
odd.sort()
for num in odd:
    sum_total += num
if len(odd) % 2 != 0:
    sum_total -= odd[0]
print(sum_total)

