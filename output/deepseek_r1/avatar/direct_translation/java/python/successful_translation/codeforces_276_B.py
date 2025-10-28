s = input().strip()
from collections import Counter
counts = Counter(s)
odd_count = sum(1 for count in counts.values() if count % 2 != 0)
print("First" if odd_count <= 1 or odd_count % 2 != 0 else "Second")
