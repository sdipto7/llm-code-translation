
def main():
    import sys

    # Read integers from standard input
    A1 = int(sys.stdin.readline().strip())
    A2 = int(sys.stdin.readline().strip())
    A3 = int(sys.stdin.readline().strip())

    # Calculate the sum
    total = A1 + A2 + A3

    # Conditional check
    if total >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()

