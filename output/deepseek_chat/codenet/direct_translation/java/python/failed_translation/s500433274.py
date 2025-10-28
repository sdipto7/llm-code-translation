from sys import stdin

def main():
    for line in stdin:
        a, b = map(int, line.split())
        c = max(a, b)
        if a == c and b != c:
            print("GREATER")
        elif b == c and a != c:
            print("LESS")
        else:
            print("EQUAL")

if __name__ == "__main__":
    main()
