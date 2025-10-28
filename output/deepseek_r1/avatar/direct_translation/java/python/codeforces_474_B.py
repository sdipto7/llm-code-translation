
import sys

data = list(map(int, sys.stdin.read().split()))
ptr = 0

n = data[ptr]
ptr += 1

arr = []
current = 0
for _ in range(n):
    current += data[ptr]
    arr.append(current)
    ptr += 1

m = data[ptr]
ptr += 1

queries = data[ptr:ptr + m]

def binary_search(arr, q):
    left = 0
    right = len(arr)
    res = 0
    while left <= right:
        mid = (left + right) // 2
        if mid >= len(arr):
            break
        if arr[mid] == q:
            return mid
        elif arr[mid] > q:
            res = mid
            right = mid - 1
        else:
            left = mid + 1
    return res

for q in queries:
    print(binary_search(arr, q) + 1)

