
def main():
    import sys
    input = sys.stdin.read
    n = int(input().strip())
    
    p = 97
    c = [''] * n
    
    for i in range(4):
        for j in range(i, n, 4):
            c[j] = chr(p)
        p += 1
    
    for i in range(n):
        print(c[i], end='')

if __name__ == "__main__":
    main()

