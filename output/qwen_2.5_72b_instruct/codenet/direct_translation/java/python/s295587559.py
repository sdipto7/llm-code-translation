
import re

in_ = input()
num = list(range(1, int(in_) + 1))
count = int(input())
pt = re.compile(r"(\d+),(\d+)")
for _ in range(count):
    next_ = input()
    matcher = pt.match(next_)
    line = [int(matcher.group(i + 1)) - 1 for i in range(2)]
    change = num[line[0]]
    num[line[0]] = num[line[1]]
    num[line[1]] = change
for i in range(len(num)):
    print(num[i])

