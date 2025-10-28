
import re

def main():
    num_size = int(input().strip())
    num = [i + 1 for i in range(num_size)]
    
    count = int(input().strip())
    pattern = re.compile(r"(\d+),(\d+)")
    line = [0, 0]

    for _ in range(count):
        next_input = input().strip()
        matcher = pattern.match(next_input)
        if matcher:
            line[0] = int(matcher.group(1)) - 1
            line[1] = int(matcher.group(2)) - 1

        change = num[line[0]]
        num[line[0]] = num[line[1]]
        num[line[1]] = change

    for number in num:
        print(number)

if __name__ == "__main__":
    main()

