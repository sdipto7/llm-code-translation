
import sys

while True:
    line = sys.stdin.readline().strip()
    if not line:
        break
    if len(line) == 1 and line == '0':
        break
    ans = sum(int(c) for c in line)
    print(ans)

