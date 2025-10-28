
n = int(input())
s = [input().strip() for _ in range(n)]
a_num = 0
b_num = 0
flag = True
ans = 0

for string in s:
    starts_b = string.startswith('B')
    ends_a = string.endswith('A')
    
    if starts_b:
        b_num += 1
    if ends_a:
        a_num += 1
    
    if starts_b or ends_a:
        if not (starts_b and ends_a):
            flag = False
    
    for j in range(len(string) - 1):
        if string[j] == 'A' and string[j+1] == 'B':
            ans += 1

ans += min(a_num, b_num)
if min(a_num, b_num) != 0 and flag:
    ans -= 1

print(ans)

