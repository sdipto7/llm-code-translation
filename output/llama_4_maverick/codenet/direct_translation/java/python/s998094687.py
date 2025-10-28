
import math

def main():
    sc = input().split()
    n = int(sc[0])
    for _ in range(n):
        a = sorted(list(map(int, input().split())))
        if a[2]**2 == a[0]**2 + a[1]**2:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

