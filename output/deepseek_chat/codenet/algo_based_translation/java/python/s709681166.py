import sys

def main():
    s = input()
    result = []
    for char in s:
        if char.isupper():
            result.append(chr(ord(char) + 32))
        elif char.islower():
            result.append(chr(ord(char) - 32))
        else:
            result.append(char)
    print(''.join(result))

if __name__ == "__main__":
    main()
