
import sys

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def main():
    import sys
    y = int(sys.stdin.readline())
    leap = check_leap(y)
    total_days = 0
    while True:
        if check_leap(y + 1):
            total_days += 366
        else:
            total_days += 365
        if total_days % 7 == 0:
            if (check_leap(y + 1) and leap) or (not check_leap(y + 1) and not leap):
                print(y + 1)
                return
        y += 1

if __name__ == "__main__":
    main()

