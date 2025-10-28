
import itertools

n = int(input())
counts = [0] * 5
char_map = {'M': 0, 'A': 1, 'R': 2, 'C': 3, 'H': 4}

for _ in range(n):
    s = input().strip()
    if s[0] in char_map:
        counts[char_map[s[0]]] += 1

total = 0
for i, j, k in itertools.combinations(range(5), 3):
    total += counts[i] * counts[j] * counts[k]

print(total)

