result = []
while True:
    line = input()
    n = int(line)
    if n == 0:
        break
    line = input()
    array2 = line.split()
    input_list = [int(x) for x in array2]
    sum_input = sum(input_list)
    avg = sum_input / n
    num = 0
    for x in input_list:
        if x <= avg:
            num += 1
    result.append(num)
for x in result:
    if x == -1:
        print("NONE")
    else:
        print(x)
