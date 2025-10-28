a, b = map(int, input().split())
count = min(a, b)
a_remaining = a - count
b_remaining = b - count
ans = (a_remaining // 2) + (b_remaining // 2)
print(count, ans)
