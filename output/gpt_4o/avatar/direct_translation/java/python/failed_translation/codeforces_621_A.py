
n = int(input())
list_nums = [int(input()) for _ in range(n)]
odd = []
total_sum = 0

for i in list_nums:
    if i % 2 == 0:
        total_sum += i
    else:
        odd.append(i)

odd.sort()

for i in odd:
    total_sum += i

if len(odd) % 2 != 0:
    total_sum -= odd[0]

print(total_sum)

