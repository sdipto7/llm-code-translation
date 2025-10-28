import sys
from itertools import permutations

min_val = float('inf')

def util(arr, ops, idx):
    global min_val
    if idx == 3:
        min_val = min(min_val, arr[0])
        return
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            a = [arr[k] for k in range(len(arr)) if k != i and k != j]
            if ops[idx] == '+':
                res = arr[i] + arr[j]
            else:
                res = arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

input = sys.stdin.read().split()
arr = list(map(int, input[:4]))
ops = input[4:7]
util(arr, ops, 0)
print(min_val)
