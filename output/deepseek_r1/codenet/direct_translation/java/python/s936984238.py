
import sys

data = list(map(int, sys.stdin.read().split()))
idx = 0
while True:
    n = data[idx]
    idx += 1
    if n == 0:
        break
    scores = data[idx:idx + n]
    idx += n
    scores_sorted = sorted(scores)
    total = sum(scores_sorted[1:-1])
    print(total // (n - 2))

