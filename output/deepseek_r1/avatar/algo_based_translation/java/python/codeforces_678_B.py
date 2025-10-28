
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(input())
leap = check_leap(y)
total_days = 0
current_year = y + 1

while True:
    if check_leap(current_year):
        total_days += 366
    else:
        total_days += 365
    
    if total_days % 7 == 0:
        if (check_leap(current_year) and leap) or (not check_leap(current_year) and not leap):
            print(current_year)
            break
    
    current_year += 1

