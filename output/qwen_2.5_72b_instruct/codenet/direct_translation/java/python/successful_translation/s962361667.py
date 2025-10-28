
import sys

w = int(input())
n = int(input())
values = [i + 1 for i in range(w)]
for i in range(n):
    str_input = input()
    a, b = map(int, str_input.split(','))
    a -= 1
    b -= 1
    values[a], values[b] = values[b], values[a]
for value in values:
    print(value)

