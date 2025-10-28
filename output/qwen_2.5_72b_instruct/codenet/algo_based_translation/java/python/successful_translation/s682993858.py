
def main():
    import sys

    while True:
        sum = 0
        s = input().strip()
        if s == "0":
            break
        for a in s:
            sum += int(a)
        print(sum)

if __name__ == "__main__":
    main()

