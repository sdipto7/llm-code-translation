
import sys
T, S, q = map(int, sys.stdin.readline().split())
previous = S
answer = 0
while previous < T:
    answer += 1
    previous *= q
print(answer)

