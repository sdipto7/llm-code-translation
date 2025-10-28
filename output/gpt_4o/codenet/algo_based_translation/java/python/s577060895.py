
import math

def main():
    n = int(input().strip())
    sqrt = math.sqrt(n)
    nearNum = math.floor(sqrt)
    ans = int(math.pow(nearNum, 2))
    print(ans)

if __name__ == "__main__":
    main()

