
from typing import List

def read_input() -> List[int]:
    N = int(input().strip())
    numbers = list(map(int, input().strip().split()))
    return numbers

def process_numbers(numbers: List[int]) -> int:
    count = 0
    N = len(numbers)
    while True:
        numbers = [i // 2 for i in numbers if i % 2 == 0]
        if len(numbers) != N:
            break
        count += 1
    return count

def main():
    numbers = read_input()
    count = process_numbers(numbers)
    print(count)

if __name__ == "__main__":
    main()

