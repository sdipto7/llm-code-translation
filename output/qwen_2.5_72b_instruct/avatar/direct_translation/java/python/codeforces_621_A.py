
import sys

input = sys.stdin.read().split()
n = int(input[0])
list = [int(x) for x in input[1:]]
odd = []
sum = 0
for i in list:
    if i % 2 == 0:
        sum += i
    else:
        odd.append(i)
odd.sort()
for i in odd:
    sum += i
if len(odd) % 2 != 0:
    sum -= odd[0]
print(sum)

