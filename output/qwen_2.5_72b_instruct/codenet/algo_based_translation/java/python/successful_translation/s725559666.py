
def main():
    import sys
    input = sys.stdin.read().split()
    a = int(input[0])
    b = int(input[1])
    c = int(input[2])
    if a < b and b < c and a < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

