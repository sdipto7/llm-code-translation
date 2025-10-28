
def main():
    a, b = map(int, input().split())
    c = 0
    if a == 1 and b == 1:
        print(c)
    else:
        while a >= 1 and b >= 1:
            if a >= b:
                a -= 2
                b += 1
            else:
                b -= 2
                a += 1
            c += 1
        print(c)

if __name__ == "__main__":
    main()

