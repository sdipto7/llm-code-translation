n = int(input())
arr = list(map(int, input().split()))[:n]
odd = even = odd_ind = even_ind = 0
for i in range(n):
    if arr[i] % 2 == 0:
        even += 1
        even_ind = i + 1
    else:
        odd += 1
        odd_ind = i + 1
print(even_ind if odd > even else odd_ind)
