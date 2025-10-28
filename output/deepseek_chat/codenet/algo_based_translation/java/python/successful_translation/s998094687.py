
import math
import sys

def main():
    n = int(input().strip())
    a = [0] * 3
    for i in range(n):
        values = list(map(int, input().split()))
        a[0] = values[0]
        a[1] = values[1]
        a[2] = values[2]
        a.sort()
        if math.pow(a[2], 2) == math.pow(a[0], 2) + math.pow(a[1], 2):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

