
from typing import List

def main():
    result: List[int] = []
    n: int = -1
    while True:
        line: str = input()
        n = int(line)
        if n == 0:
            break
        line = input()
        array2: List[str] = line.split()
        input_array: List[int] = [0] * n
        sum_values: int = 0
        for i in range(n):
            input_array[i] = int(array2[i])
            sum_values += input_array[i]
        avg: float = sum_values / n
        num: int = 0
        for i in range(n):
            if input_array[i] <= avg:
                num += 1
        result.append(num)
    for value in result:
        if value == -1:
            print("NONE")
        else:
            print(value)

if __name__ == "__main__":
    main()

