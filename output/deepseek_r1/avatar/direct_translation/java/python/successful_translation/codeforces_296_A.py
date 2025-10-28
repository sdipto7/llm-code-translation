n = int(input())
counts = [0] * 1001
for num in map(int, input().split()):
    counts[num] += 1
max_count = max(counts[1:])

if n % 2 == 0:
    print("YES" if max_count <= n // 2 else "NO")
else:
    print("YES" if max_count <= (n // 2) + 1 else "NO")
