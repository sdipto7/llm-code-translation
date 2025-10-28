
import sys

def main():
    first_line = sys.stdin.readline().strip()
    n = int(first_line[0])
    m = int(first_line[1])
    ans = []
    for i in range(n):
        s = sys.stdin.readline().strip()
        row = []
        for j in range(m):
            if s[j] == '-':
                row.append('-')
            else:
                row.append('W' if (i + j) % 2 else 'B')
        ans.append(''.join(row))
    print('\n'.join(ans))

if __name__ == "__main__":
    main()

