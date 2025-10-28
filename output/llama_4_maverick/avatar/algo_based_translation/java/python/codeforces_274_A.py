n, k = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()
count = 0
unique_elements = set()
for num in arr:
    if num % k != 0 or num // k not in unique_elements:
        count += 1
        unique_elements.add(num)
print(count)
