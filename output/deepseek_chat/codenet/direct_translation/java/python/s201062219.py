
from sys import stdin

def main():
    a = []
    while True:
        c = int(stdin.readline())
        mark = stdin.readline().strip()
        b = int(stdin.readline())
        if mark == "?":
            a.append(2000001)
            break
        elif mark == "+":
            a.append(c + b)
        elif mark == "-":
            a.append(c - b)
        elif mark == "*":
            a.append(c * b)
        elif mark == "/":
            a.append(c // b)
    
    for item in a:
        if item == 2000001:
            break
        print(item)

if __name__ == "__main__":
    main()

