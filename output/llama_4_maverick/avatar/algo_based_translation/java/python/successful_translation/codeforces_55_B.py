
import sys

min_val = sys.maxsize

def util(arr, ops, idx):
    global min_val
    if idx == 3:
        min_val = min(min_val, arr[0])
        return
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            a = [x for k, x in enumerate(arr) if k not in (i, j)]
            if ops[idx] == '+':
                res = arr[i] + arr[j]
            else:
                res = arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

def main():
    global min_val
    arr = list(map(int, input().split()))
    ops = input().split()
    util(arr, ops, 0)
    print(min_val)

if __name__ == "__main__":
    main()

