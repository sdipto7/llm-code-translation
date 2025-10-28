
import sys

def MaxInt(x, a):
    bignum = x
    for num in a:
        bignum = max(bignum, num)
    return bignum

def MinInt(y, b):
    smallnum = y
    for num in b:
        smallnum = min(smallnum, num)
    return smallnum

def CheckWar(a_val, b_val):
    if a_val >= b_val:
        print("War")
    else:
        print("No War")

data = list(map(int, sys.stdin.read().split()))
index = 0
m = data[index]
index += 1
n = data[index]
index += 1
x = data[index]
index += 1
y = data[index]
index += 1
a = data[index:index + m]
index += m
b = data[index:index + n]

x_max = MaxInt(x, a)
y_min = MinInt(y, b)
CheckWar(x_max, y_min)

