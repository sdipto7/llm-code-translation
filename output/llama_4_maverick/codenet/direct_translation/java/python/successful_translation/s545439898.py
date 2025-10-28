
import sys

count = int(sys.stdin.readline().strip())
givingNumbers = list(map(int, sys.stdin.readline().split()))

for num in reversed(givingNumbers):
    print(num, end=' ' if num != givingNumbers[0] else '\n')

