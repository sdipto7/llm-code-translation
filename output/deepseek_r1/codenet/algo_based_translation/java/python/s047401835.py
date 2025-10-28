
n = int(input())
numbers = list(map(int, input().split()))
original_N = n
count = 0

while True:
    new_numbers = [x // 2 for x in numbers if x % 2 == 0]
    if len(new_numbers) != original_N:
        break
    count += 1
    numbers = new_numbers

print(count)

