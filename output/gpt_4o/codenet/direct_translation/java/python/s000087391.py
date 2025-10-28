
def main():
    result = []
    while True:
        line = input()
        n = int(line)
        if n == 0:
            break
        line = input()
        array2 = line.split(" ")
        input_list = [int(array2[i]) for i in range(n)]
        sum_values = sum(input_list)
        avg = float(sum_values) / n
        num = sum(1 for x in input_list if x <= avg)
        result.append(num)

    for value in result:
        if value == -1:
            print("NONE")
        else:
            print(value)

main()

