
def main():
    n = input().strip()
    s = False
    for char in n:
        if char == '.':
            if s:
                print('1', end='')
                s = False
            else:
                print('0', end='')
        else:
            if s:
                print('2', end='')
                s = False
            else:
                s = True
    print()

if __name__ == "__main__":
    main()

