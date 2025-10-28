
import sys

def main():
    import sys
    import sys
    from sys import stdin
    input = stdin.read().split()
    
    n = int(input[0])
    k = int(input[1])
    l = 0
    c = 1
    
    for i in range(n):
        a = int(input[2 + i])
        if a == l:
            c += 1
        else:
            c = 1
        l = a
    
    if c + k > n:
        print(n - c)
    else:
        print(-1)

if __name__ == "__main__":
    main()

