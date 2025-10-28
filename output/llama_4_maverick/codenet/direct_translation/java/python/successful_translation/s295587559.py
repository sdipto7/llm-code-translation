
import re

def main():
    num = list(range(1, int(input()) + 1))
    count = int(input())
    for _ in range(count):
        next_input = input()
        match = re.match(r'(\d+),(\d+)', next_input)
        line = [int(match.group(i)) - 1 for i in range(1, 3)]
        num[line[0]], num[line[1]] = num[line[1]], num[line[0]]
    for i in num:
        print(i)

if __name__ == "__main__":
    main()

