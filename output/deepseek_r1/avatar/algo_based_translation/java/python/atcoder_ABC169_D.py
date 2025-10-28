
import math

n = int(input())
sqrt_n = int(math.sqrt(n))
answer = 0

for i in range(2, sqrt_n + 1):
    count = 0
    while n % i == 0:
        count += 1
        n = n // i
    j = 1
    while count >= j:
        count -= j
        answer += 1
        j += 1

if n > 1:
    answer += 1

print(answer)

