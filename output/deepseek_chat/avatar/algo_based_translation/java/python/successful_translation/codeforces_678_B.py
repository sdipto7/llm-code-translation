
import sys

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def main():
    y = int(input().strip())
    leap = check_leap(y)
    sum_days = 0
    i = y + 1
    
    while True:
        if check_leap(i):
            sum_days += 366
        else:
            sum_days += 365
            
        if sum_days % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                return
        i += 1

if __name__ == "__main__":
    main()

