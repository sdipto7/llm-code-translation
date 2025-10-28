n = int(input())
counts = [0] * 33
for x in map(int, input().split()):
    counts[bin(x).count('1')] += 1
total = 0
for c in counts:
    total += c * (c - 1) // 2
print(total)
