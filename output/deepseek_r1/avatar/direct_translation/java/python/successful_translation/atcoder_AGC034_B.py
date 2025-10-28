s = input().replace('BC', 'D')
cnt = 0
tmp = 0
for c in s:
    if c == 'A':
        tmp += 1
    elif c == 'D':
        cnt += tmp
    else:
        tmp = 0
print(cnt)
