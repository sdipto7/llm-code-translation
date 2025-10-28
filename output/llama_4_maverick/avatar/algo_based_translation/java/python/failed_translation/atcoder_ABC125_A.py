
sec = int(input())
per_num = int(input())
max_sec = float(input()) + 0.5
ans_num = 0
i = sec
while i < max_sec:
    ans_num += per_num
    i += sec
print(ans_num)

