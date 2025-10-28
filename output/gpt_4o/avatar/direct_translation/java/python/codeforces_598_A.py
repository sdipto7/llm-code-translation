
import math

def main():
    sc = int(input())
    for _ in range(sc):
        n = int(input())
        s = 0
        x = int(math.log(n) / math.log(2))
        x += 1
        s = -1 * int(math.pow(2, x)) + 2 + (n * (n + 1)) // 2 - int(math.pow(2, x))
        print(s)

main()

