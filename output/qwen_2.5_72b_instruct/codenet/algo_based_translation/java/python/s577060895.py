
import math
import sys

def main():
    n = int(sys.stdin.readline().strip())
    sqrt = math.sqrt(n)
    near_num = math.floor(sqrt)
    ans = int(math.pow(near_num, 2))
    print(ans)

if __name__ == "__main__":
    main()

