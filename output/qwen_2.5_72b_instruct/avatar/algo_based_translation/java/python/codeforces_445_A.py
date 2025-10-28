
import sys

def main():
    import sys
    import io
    sys.stdin = io.StringIO(sys.stdin.read())
    
    inp = input().split()
    n = int(inp[0])
    m = int(inp[1])
    ans = [None] * n
    
    for i in range(n):
        str_input = input()
        temp = []
        for j in range(m):
            if str_input[j] == '-':
                temp.append('-')
            else:
                if (i + j) % 2 == 1:
                    temp.append('W')
                else:
                    temp.append('B')
        ans[i] = ''.join(temp)
    
    for i in range(n):
        print(ans[i])

if __name__ == "__main__":
    main()

