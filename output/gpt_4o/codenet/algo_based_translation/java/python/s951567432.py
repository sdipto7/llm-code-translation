
def main():
    import sys
    input = sys.stdin.read
    count = int(input().strip())

    total = 0
    for ix in range(1, count + 1):
        total += ix

    print(total)

if __name__ == "__main__":
    main()

