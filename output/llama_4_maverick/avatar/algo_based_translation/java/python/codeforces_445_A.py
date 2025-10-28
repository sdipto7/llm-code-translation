
import sys

def main():
    line = sys.stdin.readline().strip()
    n, m = map(int, line.split())
    ans = []
    for _ in range(n):
        string = sys.stdin.readline().strip()
        temp = ''
        for j, char in enumerate(string):
            if char == '-':
                temp += '-'
            else:
                if (_ + j) % 2 == 1:
                    temp += 'W'
                else:
                    temp += 'B'
        ans.append(temp)
    for string in ans:
        print(string)

if __name__ == "__main__":
    main()

