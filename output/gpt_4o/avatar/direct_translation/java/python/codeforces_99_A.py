
str = list(input())
dot_index = 0
for i in range(len(str)):
    if str[i] == '.':
        dot_index = i
        break
if str[dot_index - 1] == '9':
    print("GOTO Vasilisa.")
elif int(str[dot_index + 1]) > 4:
    _str = ""
    for i in range(dot_index):
        _str += str[i]
    print(int(_str) + 1)
else:
    for i in range(dot_index):
        print(str[i], end='')
    print()

