
import sys

min_value = sys.maxsize

def main():
    global min_value
    arr = []
    # Reading 4 long integers
    for _ in range(4):
        arr.append(int(input().strip()))
    
    # Reading 3 operations
    ops = []
    for _ in range(3):
        ops.append(input().strip())
    
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
            if idx < 3 and ops[idx] == "+":
                res = arr[i] + arr[j]
            else:
                res = arr[i] * arr[j]
            a.append(res)
            util(a, ops, idx + 1)

if __name__ == "__main__":
    main()

