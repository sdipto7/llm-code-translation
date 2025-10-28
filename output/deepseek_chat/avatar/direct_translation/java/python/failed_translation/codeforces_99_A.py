
str = list(input())
dotIndex = 0
for i in range(len(str)):
    if str[i] == '.':
        dotIndex = i
        break
if str[dotIndex - 1] == '9':
    print("GOTO Vasilisa.")
elif int(str[dotIndex + 1]) > 4:
    _str = ''.join(str[:dotIndex])
    print(str(int(_str) + 1))
else:
    print(''.join(str[:dotIndex]))

