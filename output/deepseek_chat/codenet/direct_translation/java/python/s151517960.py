
n = int(input())
count_map = {}
for _ in range(n):
    a = int(input())
    if a in count_map:
        count_map[a] += 1
    else:
        count_map[a] = 1
ans = 0
for key in count_map:
    if count_map[key] % 2 == 1:
        ans += 1
print(ans)

