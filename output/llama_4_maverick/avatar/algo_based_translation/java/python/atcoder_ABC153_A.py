
import sys
str = sys.stdin.readline().strip()
str = str.split(" ")
h = int(str[0])
a = int(str[1])
num = 0
while h > 0:
    h = h - a
    num += 1
print(num)

