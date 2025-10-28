
def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()

    for s in data:
        if s == "0":
            break
        sum = 0
        for a in s:
            sum += int(a)
        print(sum)

if __name__ == "__main__":
    main()

