import sys

a = int(sys.stdin.readline().strip())
b = sys.stdin.readline().strip()
bStr = ''.join(c for c in b if c != '.')
bInt = int(bStr)
result = (a * bInt) // 100
print(result)
