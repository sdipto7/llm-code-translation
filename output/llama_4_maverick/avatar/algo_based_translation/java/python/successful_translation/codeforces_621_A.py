
n = int(input())
numbers = list(map(int, input().split()))
odd_numbers = []
total_sum = 0
for num in numbers:
    if num % 2 == 0:
        total_sum += num
    else:
        odd_numbers.append(num)
odd_numbers.sort()
total_sum += sum(odd_numbers)
if len(odd_numbers) % 2 != 0:
    total_sum -= odd_numbers[0]
print(total_sum)

