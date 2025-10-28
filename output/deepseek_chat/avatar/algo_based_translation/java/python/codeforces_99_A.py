
import sys
from decimal import Decimal

def main():
    input_line = sys.stdin.readline().strip()
    str_arr = list(input_line)
    dot_index = 0
    
    for i in range(len(str_arr)):
        if str_arr[i] == '.':
            dot_index = i
            break
    
    if str_arr[dot_index - 1] == '9':
        print("GOTO Vasilisa.")
    else:
        next_char = str_arr[dot_index + 1]
        next_digit = int(next_char)
        
        if next_digit > 4:
            num_str = ''.join(str_arr[:dot_index])
            num = Decimal(num_str)
            result = num + Decimal('1')
            print(str(result))
        else:
            for i in range(dot_index):
                print(str_arr[i], end='')
            print()

if __name__ == "__main__":
    main()

