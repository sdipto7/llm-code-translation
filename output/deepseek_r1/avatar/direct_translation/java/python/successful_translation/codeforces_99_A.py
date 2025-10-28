
s = input().strip()
dot = s.index('.')
if s[dot-1] == '9':
    print("GOTO Vasilisa.")
elif s[dot+1] > '4':
    print(int(s[:dot]) + 1)
else:
    print(s[:dot])

