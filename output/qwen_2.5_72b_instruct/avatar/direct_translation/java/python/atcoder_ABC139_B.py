
import sys

A = int(input().split()[0])
B = int(input().split()[1])
amari = 0
result = 0
result = (B - 1) // (A - 1)
amari = (B - 1) % (A - 1)
if amari != 0:
    result += 1
print(result)

