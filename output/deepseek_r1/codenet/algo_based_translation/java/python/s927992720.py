
def main():
    while True:
        line = input().split()
        a = int(line[0])
        op = line[1]
        b = int(line[2])
        if op == '?':
            break
        if op == '+':
            print(a + b)
        if op == '-':
            print(a - b)
        if op == '*':
            print(a * b)
        if op == '/':
            print(a // b)

if __name__ == "__main__":
    main()

