
from sys import stdin
from decimal import Decimal

def main():
    str_input = stdin.readline().strip()
    str = list(str_input)
    dot_index = 0
    for i in range(len(str)):
        if str[i] == '.':
            dot_index = i
            break
    if str[dot_index - 1] == '9':
        print("GOTO Vasilisa.")
    elif int(str[dot_index + 1]) > 4:
        _str = ''.join(str[:dot_index])
        result = str(int(_str) + 1)
        print(result)
    else:
        print(''.join(str[:dot_index]))

if __name__ == "__main__":
    main()

