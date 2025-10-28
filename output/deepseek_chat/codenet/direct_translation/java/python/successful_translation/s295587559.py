
import re

def main():
    num = [i + 1 for i in range(int(input()))]
    count = int(input())
    pattern = re.compile(r"(\d+),(\d+)")
    for _ in range(count):
        next_input = input()
        match = pattern.match(next_input)
        line = [int(match.group(1)) - 1, int(match.group(2)) - 1]
        num[line[0]], num[line[1]] = num[line[1]], num[line[0]]
    for n in num:
        print(n)

if __name__ == "__main__":
    main()

