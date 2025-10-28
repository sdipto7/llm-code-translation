
import sys

def main():
    h = int(sys.stdin.readline())
    w = int(sys.stdin.readline())
    ans = []
    for _ in range(h):
        s = sys.stdin.readline().strip()
        ans.append('#' + s + '#')
    border = '#' * (w + 2)
    print(border)
    for row in ans:
        print(row)
    print(border)

if __name__ == "__main__":
    main()

