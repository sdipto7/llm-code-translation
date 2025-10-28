import sys

def main():
    import sys
    str = sys.stdin.readline().strip().split()
    h = int(str[0])
    a = int(str[1])
    num = 0
    while h > 0:
        h -= a
        num += 1
    print(num)

if __name__ == "__main__":
    main()
