def main():
    map = {}
    n = int(input())
    str = input()
    for i in range(n):
        line = input()
        map[line] = ""
    print(len(map))

if __name__ == "__main__":
    main()
