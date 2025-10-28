import sys

a, b, c = map(int, sys.stdin.readline().split())
answer = "No"
if a + b >= c:
    answer = "Yes"
print(answer)
