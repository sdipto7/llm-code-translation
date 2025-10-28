
parts = input().split()
arr = list(map(int, parts[:4]))
ops = parts[4:7]

min_val = float('inf')

def recurse(current, op_idx):
    global min_val
    if op_idx == 3:
        if current[0] < min_val:
            min_val = current[0]
        return
    for i in range(len(current)):
        for j in range(i + 1, len(current)):
            new_list = []
            for k in range(len(current)):
                if k != i and k != j:
                    new_list.append(current[k])
            res = current[i] + current[j] if ops[op_idx] == '+' else current[i] * current[j]
            new_list.append(res)
            recurse(new_list, op_idx + 1)

recurse(arr, 0)
print(min_val)

