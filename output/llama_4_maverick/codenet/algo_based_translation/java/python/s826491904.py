
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline

    def solve(self):
        N = int(self.sc().strip())
        numbers = list(map(int, self.sc().strip().split()))
        if N > len(numbers):
            for _ in range(N - len(numbers)):
                numbers.append(int(self.sc().strip()))
        max_num = min_num = numbers[0]
        for num in numbers[1:]:
            max_num = max(max_num, num)
            min_num = min(min_num, num)
        print(max_num - min_num)

if __name__ == "__main__":
    Main().solve()

However, a more pythonic way to solve this problem is:

import sys

def main():
    N = int(sys.stdin.readline().strip())
    numbers = []
    for _ in range(N):
        numbers.append(int(sys.stdin.readline().strip()))
    print(max(numbers) - min(numbers))

if __name__ == "__main__":
    main()

