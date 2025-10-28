
n, m = map(int, input().split())
map_ = {}
count_ac = 0
count_wa_all = 0

for _ in range(m):
    question, result = input().split()
    question = int(question)
    if question not in map_:
        if result == 'WA':
            map_[question] = 1
        else:
            map_[question] = -1
            count_ac += 1
    else:
        current = map_[question]
        if current < 0:
            continue
        else:
            if result == 'WA':
                map_[question] += 1
            else:
                count_ac += 1
                count_wa_all += current
                map_[question] = -current

print(count_ac, count_wa_all)

