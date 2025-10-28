
import math

def main():
    n = int(input())
    for _ in range(n):
        a = [int(input()), int(input()), int(input())]
        a.sort()
        if math.pow(a[2], 2) == math.pow(a[0], 2) + math.pow(a[1], 2):
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

