
import math

class Main:
    def main():
        n = int(input())
        for _ in range(n):
            a = sorted([int(x) for x in input().split()])
            if math.pow(a[2], 2) == math.pow(a[0], 2) + math.pow(a[1], 2):
                print("YES")
            else:
                print("NO")

if __name__ == "__main__":
    Main.main()

