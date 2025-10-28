
result = []
while True:
    try:
        n = int(input().strip())
        if n == 0:
            break
        line = input().strip()
        array2 = line.split(" ")
        input_array = [int(i) for i in array2]
        total_sum = sum(input_array)
        avg = total_sum / n
        num = sum(1 for i in input_array if i <= avg)
        result.append(num)
    except EOFError:
        break
    except ValueError:
        break
for i in result:
    print(i)

