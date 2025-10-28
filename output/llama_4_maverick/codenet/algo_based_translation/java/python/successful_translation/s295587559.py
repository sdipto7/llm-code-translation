
import re

def main():
    num_size = int(input())
    num = list(range(1, num_size + 1))
    count = int(input())
    pt = re.compile(r"(\d+),(\d+)")
    for _ in range(count):
        next_input = input()
        matcher = pt.match(next_input)
        if matcher:
            line = [int(matcher.group(1)) - 1, int(matcher.group(2)) - 1]
            num[line[0]], num[line[1]] = num[line[1]], num[line[0]]
    for n in num:
        print(n)

if __name__ == "__main__":
    main()

