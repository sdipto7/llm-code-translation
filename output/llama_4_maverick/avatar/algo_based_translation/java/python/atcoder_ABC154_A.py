
import sys
str = sys.stdin.readline().strip().split()
a, b = map(int, sys.stdin.readline().strip().split())
u = sys.stdin.readline().strip()
print(f'{a-1} {b}' if u == str[0] else f'{a} {b-1}')

