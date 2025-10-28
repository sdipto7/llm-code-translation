
import sys
import re

data = sys.stdin.read().split()
ptr = 0

n = int(data[ptr])
ptr += 1
count = int(data[ptr])
ptr += 1
commands = data[ptr:ptr + count]

num = list(range(1, n + 1))

for cmd in commands:
    match = re.fullmatch(r'(\d+),(\d+)', cmd)
    if match:
        a = int(match.group(1)) - 1
        b = int(match.group(2)) - 1
        num[a], num[b] = num[b], num[a]

for x in num:
    print(x)

