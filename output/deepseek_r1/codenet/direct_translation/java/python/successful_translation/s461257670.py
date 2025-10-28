
def Answer(y, m, d):
    result = 1
    if y % 3 == 0:
        result += 20 - d
    else:
        if m % 2 == 0:
            result += 19 - d
        else:
            result += 20 - d

    for next_m in range(m + 1, 11):
        if y % 3 == 0:
            result += 20
        else:
            if next_m % 2 == 0:
                result += 19
            else:
                result += 20

    for year in range(y + 1, 1000):
        if year % 3 == 0:
            result += 200
        else:
            result += 195

    return result

n = int(input())
for _ in range(n):
    y, m, d = map(int, input().split())
    print(Answer(y, m, d))

