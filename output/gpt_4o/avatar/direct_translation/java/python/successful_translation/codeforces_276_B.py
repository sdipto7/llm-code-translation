
from sys import stdin, stdout
from collections import defaultdict

str = stdin.readline().strip()
map = defaultdict(int)
odd_count = 0

for ch in str:
    map[ch] += 1

for count in map.values():
    if count % 2 != 0:
        odd_count += 1

if odd_count <= 1 or odd_count % 2 != 0:
    stdout.write("First\n")
else:
    stdout.write("Second\n")

