import re
import sys

def main():
    in_ = sys.stdin
    n = int(in_.readline())
    num = [i + 1 for i in range(n)]
    count = int(in_.readline())
    pt = re.compile(r"(\d+),(\d+)")
    line = [0, 0]
    for _ in range(count):
        next_ = in_.readline().strip()
        matcher = pt.match(next_)
        if matcher:
            for j in range(2):
                line[j] = int(matcher.group(j + 1)) - 1
            change = num[line[0]]
            num[line[0]] = num[line[1]]
            num[line[1]] = change
    for i in range(n):
        print(num[i])

if __name__ == "__main__":
    main()
