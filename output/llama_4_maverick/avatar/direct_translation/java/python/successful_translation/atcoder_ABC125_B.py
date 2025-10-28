
def str2list(s):
    return list(map(int, s.split()))

n = int(input())
v_list = str2list(input())
c_list = str2list(input())
max_profit = sum(max(v - c, 0) for v, c in zip(v_list, c_list))
print(max_profit)

