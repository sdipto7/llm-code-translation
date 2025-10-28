from sys import stdin

i = 0

for i in range(1, 6):
    n = int(stdin.readline())
    if n == 0:
        break

print(i)
