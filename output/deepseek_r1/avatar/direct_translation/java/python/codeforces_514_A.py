
x = int(input())
digits = []
while x > 0:
    digit = x % 10
    if 9 - digit < digit:
        if x // 10 == 0 and (9 - digit) == 0:
            new_digit = digit
        else:
            new_digit = 9 - digit
    else:
        new_digit = digit
    digits.append(new_digit)
    x = x // 10

new_number = 0
for i, d in enumerate(digits):
    new_number += d * (10 ** i)

print(new_number)

