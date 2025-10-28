
import sys
n = int(sys.stdin.readline())
lst = [int(sys.stdin.readline()) for _ in range(n)]
odd = []
total = 0
for num in lst:
    if num % 2 == 0:
        total += num
    else:
        odd.append(num)
odd.sort()
for num in odd:
    total += num
if len(odd) % 2 != 0:
    total -= odd[0]
print(total)

