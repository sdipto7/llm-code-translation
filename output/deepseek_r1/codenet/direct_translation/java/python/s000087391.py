
result = []
while True:
    line = input().strip()
    n = int(line)
    if n == 0:
        break
    numbers_line = input().strip()
    numbers = list(map(int, numbers_line.split()))
    sum_numbers = sum(numbers)
    average = sum_numbers / n
    count = 0
    for num in numbers:
        if num <= average:
            count += 1
    result.append(count)
for res in result:
    if res == -1:
        print("NONE")
    else:
        print(res)

