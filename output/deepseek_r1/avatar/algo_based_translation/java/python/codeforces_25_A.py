
import sys

data = list(map(int, sys.stdin.read().split()))
n = data[0]
array = [0] + data[1:n+1]
odd = even = 0
odd_ind = even_ind = 0

for i in range(1, n+1):
    if array[i] % 2 == 0:
        even += 1
        even_ind = i
    else:
        odd += 1
        odd_ind = i

print(even_ind if odd > even else odd_ind)

