
import sys

def main():
    while True:
        data = sys.stdin.readline().split()
        if not data:
            continue
        a = int(data[0])
        op = data[1]
        b = int(data[2])
        
        if op == "?":
            break
        elif op == "+":
            print(a + b)
        elif op == "-":
            print(a - b)
        elif op == "*":
            print(a * b)
        elif op == "/":
            print(a // b)

if __name__ == "__main__":
    main()

