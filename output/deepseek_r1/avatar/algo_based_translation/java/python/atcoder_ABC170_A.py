
def main():
    line = input()
    input_array = line.split(' ')
    while len(input_array) > 0 and input_array[-1] == '':
        input_array.pop()
    result = 0
    for s in input_array:
        result += 1
        if s == '0':
            break
    print(result)

if __name__ == "__main__":
    main()

