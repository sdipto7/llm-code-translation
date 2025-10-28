import sys
h, a = map(int, sys.stdin.readline().split())
print(h // a if h % a == 0 else h // a + 1)
