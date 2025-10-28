
def main():
    s = input()
    
    for c in s:
        if c.isupper():
            c = chr(ord(c) + 32)
            print(c, end='')
        elif c.islower():
            c = chr(ord(c) - 32)
            print(c, end='')
        else:
            print(c, end='')
    print()

if __name__ == "__main__":
    main()

