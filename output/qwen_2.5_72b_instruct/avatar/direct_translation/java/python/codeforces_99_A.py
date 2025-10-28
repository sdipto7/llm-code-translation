
import sys

str_input = sys.stdin.readline().strip()
dot_index = str_input.index('.')
if str_input[dot_index - 1] == '9':
    print("GOTO Vasilisa.")
elif int(str_input[dot_index + 1]) > 4:
    print(int(str_input[:dot_index]) + 1)
else:
    print(str_input[:dot_index])

