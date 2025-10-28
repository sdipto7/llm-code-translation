import sys

def main():
    import sys
    h = int(sys.stdin.readline())
    a = int(sys.stdin.readline())
    if h % a == 0:
        print(h // a)
    else:
        print(h // a + 1)

if __name__ == "__main__":
    main()
