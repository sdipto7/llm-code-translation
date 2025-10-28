
import sys

def main():
    tokens = sys.stdin.read().split()
    a = []
    index = 0
    while index + 2 < len(tokens):
        c = int(tokens[index])
        mark = tokens[index + 1]
        b = int(tokens[index + 2])
        index += 3
        if mark == '?':
            a.append(2000001)
            break
        elif mark == '+':
            a.append(c + b)
        elif mark == '-':
            a.append(c - b)
        elif mark == '*':
            a.append(c * b)
        elif mark == '/':
            a.append(int(c / b))
    for num in a:
        if num == 2000001:
            break
        print(num)

if __name__ == "__main__":
    main()

