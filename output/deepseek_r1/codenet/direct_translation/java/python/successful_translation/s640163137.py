n = int(input())
a = list(map(int, input().split()))
swap_count = 0

for i in range(n):
    min_idx = i
    for j in range(i, n):
        if a[j] < a[min_idx]:
            min_idx = j
    if min_idx != i:
        a[i], a[min_idx] = a[min_idx], a[i]
        swap_count += 1

print(' '.join(map(str, a)))
print(swap_count)
