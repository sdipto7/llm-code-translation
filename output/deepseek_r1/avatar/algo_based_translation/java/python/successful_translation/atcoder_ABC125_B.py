
def str_to_list(s):
    parts = s.split()
    ret = {}
    key = 0
    for val in parts:
        ret[key] = int(val)
        key += 1
    return ret

n = int(input())
v_str = input().strip()
c_str = input().strip()
v_list = str_to_list(v_str)
c_list = str_to_list(c_str)
max_val = 0
for i in range(n):
    profit = v_list[i] - c_list[i]
    if profit > 0:
        max_val += profit
print(max_val)

