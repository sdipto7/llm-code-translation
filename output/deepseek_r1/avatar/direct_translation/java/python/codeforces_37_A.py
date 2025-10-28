import sys
from collections import Counter

n = int(sys.stdin.readline())
bars = list(map(int, sys.stdin.read().split()))[:n]
counts = Counter(bars)
max_count = max(counts.values())
print(f"{max_count}{len(counts)}")
