
import sys
from collections import defaultdict

sc = sys.stdin
N = int(sc.readline().strip())
map = defaultdict(int)
for i in range(1, N + 1):
    map[i] = int(sc.readline().strip())
sorted_keys = sorted(map, key=map.get)
print(" ".join(map(str, sorted_keys)))

