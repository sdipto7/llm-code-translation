
def main():
    n = int(input().strip())
    if n == 1:
        print("Hello World")
    else:
        strs = [input().strip() for _ in range(2)]
        print(int(strs[0]) + int(strs[1]))

if __name__ == "__main__":
    main()

