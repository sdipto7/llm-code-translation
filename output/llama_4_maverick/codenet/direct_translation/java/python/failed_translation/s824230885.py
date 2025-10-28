
import sys

def main():
    input = sys.stdin.read().split()
    input_index = 0

    def next():
        nonlocal input_index
        input_index += 1
        return input[input_index - 1]

    def has_next():
        return input_index < len(input)

    def next_int():
        return int(next())

    def next_int_array():
        return list(map(int, next().split()))

    N = next_int()
    list = list(map(int, input[input_index].split()))
    input_index += 1
    max_val = 0
    output = 0
    for i in range(N):
        if max_val <= list[i]:
            max_val = list[i]
            output += 1
    print(output)

if __name__ == "__main__":
    main()

