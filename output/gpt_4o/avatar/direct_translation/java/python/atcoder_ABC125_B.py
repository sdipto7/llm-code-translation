
def str2list(s):
    return list(map(int, s.split()))

n = int(input().strip())
v_list = str2list(input().strip())
c_list = str2list(input().strip())
max_profit = 0

for i in range(n):
    profit = v_list[i] - c_list[i]
    if profit > 0:
        max_profit += profit

print(max_profit)

