import sys

sc = map(int, sys.stdin.readline().split())
a, b, c = next(sc), next(sc), next(sc)
answer = "No"
if a + b >= c:
    answer = "Yes"
print(answer)
