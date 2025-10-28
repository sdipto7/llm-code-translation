
n = int(input())
a = list(map(int, input().split()))
index_map = {num: i for i, num in enumerate(a)}
sorted_a = sorted(a)
diff = 0
for i, num in enumerate(sorted_a):
    original_idx = index_map[num]
    if i % 2 != original_idx % 2:
        diff += 1
print(diff // 2)

