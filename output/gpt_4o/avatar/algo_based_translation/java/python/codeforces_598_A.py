
import math

def main():
    sc = int(input())
    for _ in range(sc):
        n = int(input())
        x = int(math.log(n, 2)) + 1
        s = -1 * int(math.pow(2, x)) + 2 + (n * (n + 1)) // 2 - int(math.pow(2, x))
        print(s)

if __name__ == "__main__":
    main()

