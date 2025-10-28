
import sys

data = list(map(int, sys.stdin.read().split()))
N = data[0]
d = {i+1: data[i+1] for i in range(N)}
sorted_keys = [str(k) for k, v in sorted(d.items(), key=lambda item: item[1])]
print(' '.join(sorted_keys))

