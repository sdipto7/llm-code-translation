
import sys

sc = sys.stdin
h1 = int(sc.readline())
m1 = int(sc.readline())
h2 = int(sc.readline())
m2 = int(sc.readline())
k = int(sc.readline())
t1 = h1 * 60 + m1
t2 = h2 * 60 + m2
print(t2 - t1 - k)

