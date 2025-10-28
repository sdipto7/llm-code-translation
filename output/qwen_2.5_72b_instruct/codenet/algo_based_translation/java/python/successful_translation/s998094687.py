
import math
import sys

def main():
    import sys
    import math

    n = int(input().strip())
    a = [0] * 3
    for _ in range(n):
        a[0], a[1], a[2] = map(int, input().strip().split())
        a.sort()
        if math.pow(a[2], 2) == math.pow(a[0], 2) + math.pow(a[1], 2):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

