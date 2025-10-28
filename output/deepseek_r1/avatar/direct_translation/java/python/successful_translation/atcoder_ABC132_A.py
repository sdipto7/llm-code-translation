s = input().strip()
from collections import Counter
counts = Counter(s)
print("Yes" if len(counts) == 2 and all(v == 2 for v in counts.values()) else "No")
