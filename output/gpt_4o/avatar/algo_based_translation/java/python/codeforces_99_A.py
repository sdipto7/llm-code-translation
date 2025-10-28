
import sys

def main(args):
    str_input = input().strip()
    str_arr = list(str_input)
    
    dot_index = 0
    for i in range(len(str_arr)):
        if str_arr[i] == '.':
            dot_index = i
            break
    
    if str_arr[dot_index - 1] == '9':
        print("GOTO Vasilisa.")
    elif int(str_arr[dot_index + 1]) > 4:
        _str = ''.join(str_arr[:dot_index])
        result = int(_str) + 1
        print(result)
    else:
        print(''.join(str_arr[:dot_index]))

if __name__ == "__main__":
    main(sys.argv)

