
sec, per_num, max_sec = map(int, input().split())
max_sec += 0.5
ans_num = 0
i = sec
while i < max_sec:
    ans_num += per_num
    i += sec
print(ans_num)

