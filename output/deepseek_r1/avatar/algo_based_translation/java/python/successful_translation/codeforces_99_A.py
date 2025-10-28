
s = input().strip()
dot_index = s.find('.')
if s[dot_index - 1] == '9':
    print("GOTO Vasilisa.")
else:
    next_digit = s[dot_index + 1]
    if int(next_digit) > 4:
        integer_part = s[:dot_index]
        print(str(int(integer_part) + 1))
    else:
        print(s[:dot_index])

