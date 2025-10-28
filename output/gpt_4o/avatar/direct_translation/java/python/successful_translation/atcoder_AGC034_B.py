
def main():
    import sys
    input = sys.stdin.read
    s = input().strip().replace("BC", "D")
    cnt = 0
    tmp = 0
    for char in s:
        if char == 'A':
            tmp += 1
        elif char == 'D':
            cnt += tmp
        else:
            tmp = 0
    print(cnt)

if __name__ == "__main__":
    main()

