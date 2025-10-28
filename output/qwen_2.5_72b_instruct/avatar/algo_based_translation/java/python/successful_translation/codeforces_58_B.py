
import sys

def main():
    import sys
    import math
    n = int(input().strip())
    print(n, end=' ')
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=' ')
            m = i

if __name__ == "__main__":
    main()

