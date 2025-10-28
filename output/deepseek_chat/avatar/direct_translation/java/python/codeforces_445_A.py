
import sys

def main():
    inp = sys.stdin.readline().split()
    n = int(inp[0])
    m = int(inp[1])
    ans = []
    for i in range(n):
        str = sys.stdin.readline().strip()
        temp = []
        for j in range(m):
            if str[j] == '-':
                temp.append('-')
            else:
                if (i + j) % 2 == 1:
                    temp.append('W')
                else:
                    temp.append('B')
        ans.append(''.join(temp))
    for line in ans:
        print(line)

if __name__ == "__main__":
    main()

