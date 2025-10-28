
import sys

min_val = float('inf')

def util(arr, ops, idx):
    global min_val
    if idx == 3:
        if arr[0] < min_val:
            min_val = arr[0]
        return
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            a = []
            for k in range(len(arr)):
                if k != i and k != j:
                    a.append(arr[k])
            res = arr[i] + arr[j] if ops[idx] == '+' else arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

def main():
    global min_val
    data = sys.stdin.read().split()
    arr = list(map(int, data[:4]))
    ops = data[4:7]
    util(arr, ops, 0)
    print(min_val)

if __name__ == "__main__":
    main()

