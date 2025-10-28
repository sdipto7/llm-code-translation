
from typing import List

def main():
    import sys
    import io
    import re
    import itertools

    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    numbers: List[int] = list(map(int, data[1:N+1]))

    count = 0

    while True:
        numbers = [i // 2 for i in numbers if i % 2 == 0]
        if len(numbers) == N:
            count += 1
        else:
            break

    print(count)

if __name__ == "__main__":
    main()

