
n, x = map(int, input().split())
srime_list = list(map(int, input().split()))

cost_list = []
for i in range(n):
    row = [srime_list[i]]
    for cast_num in range(1, n):
        prev = row[cast_num - 1]
        current_val = srime_list[(i - cast_num + n) % n]
        row.append(min(prev, current_val))
    cost_list.append(row)

result = []
for k in range(n):
    sum_col = sum(cost_array[k] for cost_array in cost_list)
    result.append(k * x + sum_col)

print(min(result))

