
s = input().strip()
dot_index = s.index('.')
if s[dot_index - 1] == '9':
    print("GOTO Vasilisa.")
elif int(s[dot_index + 1]) > 4:
    num = str(int(s[:dot_index]) + 1)
    print(num)
else:
    print(s[:dot_index])

