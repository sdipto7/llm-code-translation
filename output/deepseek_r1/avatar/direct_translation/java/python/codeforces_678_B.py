
def is_leap(year):
    return year % 400 == 0 or (year % 4 == 0 and year % 100 != 0)

y = int(input())
original_leap = is_leap(y)
sum_days = 0
current = y + 1

while True:
    if is_leap(current):
        sum_days += 366
    else:
        sum_days += 365

    if sum_days % 7 == 0:
        if is_leap(current) == original_leap:
            print(current)
            break

    current += 1

