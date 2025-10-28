import sys

def main():
    scanner = sys.stdin
    h = int(scanner.readline().strip())
    w = int(scanner.readline().strip())
    ans = [None] * h
    for i in range(h):
        line = scanner.readline().strip()
        ans[i] = '#' + line + '#'
    border = '#' * (w + 2)
    print(border)
    for s in ans:
        print(s)
    print(border)

if __name__ == "__main__":
    main()
