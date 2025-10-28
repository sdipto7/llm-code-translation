
n = int(input())
array = [0] * n
max_val = 0
min_val = 10000
for i in range(n):
    array[i] = int(input())
    if max_val < array[i]:
        max_val = array[i]
    if min_val > array[i]:
        min_val = array[i]
print(max_val - min_val)

