
from sys import stdin

min_value = float('inf')

def main():
    global min_value
    arr = list(map(int, stdin.readline().split()))
    ops = [stdin.readline().strip() for _ in range(3)]
    util(arr, ops, 0)
    print(min_value)

def util(arr, ops, idx):
    global min_value
    if idx == 3:
        min_value = min(min_value, arr[0])
        return
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            a = [arr[k] for k in range(len(arr)) if k != i and k != j]
            if ops[idx] == "+":
                res = arr[i] + arr[j]
            else:
                res = arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

if __name__ == "__main__":
    main()

