
def is_leap_year(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(input())
leap = is_leap_year(y)
total_days = 0
y += 1
while True:
    if is_leap_year(y):
        total_days += 366
    else:
        total_days += 365
    if total_days % 7 == 0:
        if is_leap_year(y) == leap:
            print(y)
            break
    y += 1

