
import sys

n = int(input())
h_list = [int(input()) for _ in range(n)]

min_n = h_list[0] - 1

for h in h_list[1:]:
    if min_n == h:
        min_n = h
    elif min_n == h - 1:
        min_n = h - 1
    elif min_n < h - 1:
        min_n = h - 1
    elif min_n > h:
        print("No")
        sys.exit()

print("Yes")

