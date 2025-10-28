
import sys
import math

data = list(map(int, sys.stdin.read().split()))
results = []
for i in range(0, len(data), 2):
    a = data[i]
    b = data[i + 1]
    total = a + b
    digits = int(math.log10(total)) + 1
    results.append(str(digits))
print('\n'.join(results))

