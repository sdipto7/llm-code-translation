
import sys

def main():
    number = int(input().strip())
    value = 0
    mask = 2
    while value < number:
        binary_str = bin(mask)[3:]
        zeros = binary_str.count('0')
        if zeros != len(binary_str) - zeros:
            mask += 1
            continue
        s = binary_str.replace('0', '4').replace('1', '7')
        value = int(s)
        mask += 1
    print(value)

if __name__ == "__main__":
    main()

