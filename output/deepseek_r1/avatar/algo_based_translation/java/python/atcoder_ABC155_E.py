
import sys

def main():
    number = sys.stdin.readline().strip()
    digits = [0] * (len(number) + 1)
    for i in range(len(number)):
        digits[i] = int(number[len(number) - 1 - i])
    bills = 0
    for i in range(len(digits)):
        if digits[i] == 10:
            digits[i] = 0
            if i + 1 < len(digits):
                digits[i + 1] += 1
        if digits[i] < 5:
            bills += digits[i]
        elif digits[i] == 5:
            if i + 1 < len(digits) and digits[i + 1] >= 5:
                if i + 1 < len(digits):
                    digits[i + 1] += 1
            bills += 5
        else:
            bills += 10 - digits[i]
            if i + 1 < len(digits):
                digits[i + 1] += 1
    print(bills)

if __name__ == "__main__":
    main()

