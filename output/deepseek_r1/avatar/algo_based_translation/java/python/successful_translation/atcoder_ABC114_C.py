
N = int(input())
i = 357
c = 0

while i <= N:
    s = str(i)
    if {'3', '5', '7'}.issubset(set(s)):
        c += 1
    new_digits = []
    f = False
    for d in reversed(s):
        if f:
            new_digits.append(d)
        else:
            if d == '3':
                new_digits.append('5')
                f = True
            elif d == '5':
                new_digits.append('7')
                f = True
            elif d == '7':
                new_digits.append('3')
                f = False
    if not f:
        new_digits.append('3')
    next_i_str = ''.join(reversed(new_digits))
    i = int(next_i_str)

print(c)

