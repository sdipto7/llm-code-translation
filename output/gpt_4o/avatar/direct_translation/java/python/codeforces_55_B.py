
import sys

min_value = sys.maxsize

def util(arr, ops, idx):
    global min_value
    if idx == 3:
        min_value = min(min_value, arr[0])
        return
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            a = []
            for k in range(len(arr)):
                if k != j and k != i:
                    a.append(arr[k])
            if idx < 3 and ops[idx] == "+":
                res = arr[i] + arr[j]
            else:
                res = arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

arr = [int(input()) for _ in range(4)]
ops = [input() for _ in range(3)]
util(arr, ops, 0)
print(min_value)

