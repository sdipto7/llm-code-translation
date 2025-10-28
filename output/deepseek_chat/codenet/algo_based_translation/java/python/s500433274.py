import sys

def main():
    while True:
        try:
            line = input().split()
            if not line:
                continue
            a = int(line[0])
            b = int(line[1])
            c = max(a, b)
            if a == c and b != c:
                print("GREATER")
            elif b == c and a != c:
                print("LESS")
            else:
                print("EQUAL")
        except EOFError:
            break

if __name__ == "__main__":
    main()
