
import sys

data = list(map(int, sys.stdin.read().split()))
m, n, x, y = data[0], data[1], data[2], data[3]
a = data[4 : 4 + m]
b = data[4 + m : 4 + m + n]
x_max = max([x] + a)
y_min = min([y] + b)
print("War" if x_max >= y_min else "No War")

