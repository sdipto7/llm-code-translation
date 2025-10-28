
import math

def main():
    x = int(input())
    digits = []
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                digits.append(r)
            else:
                digits.append(9 - r)
        else:
            digits.append(r)
        x = x // 10
    new_number = 0
    pow = 0
    for digit in digits:
        new_number += digit * (10 ** pow)
        pow += 1
    print(new_number)

if __name__ == "__main__":
    main()

