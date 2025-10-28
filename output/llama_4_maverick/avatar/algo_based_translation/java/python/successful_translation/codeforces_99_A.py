
def main():
    str = input().strip()
    dotIndex = str.find('.')
    if str[dotIndex - 1] == '9':
        print("GOTO Vasilisa.")
    else:
        if int(str[dotIndex + 1]) > 4:
            _str = str[:dotIndex]
            print(int(_str) + 1)
        else:
            print(str[:dotIndex])

if __name__ == "__main__":
    main()

