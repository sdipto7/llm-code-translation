
def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    inp = data[0].split()
    n = int(inp[0])
    m = int(inp[1])
    
    ans = [''] * n
    
    for i in range(n):
        str_line = data[i + 1]
        temp = []
        
        for j in range(m):
            if str_line[j] == '-':
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

