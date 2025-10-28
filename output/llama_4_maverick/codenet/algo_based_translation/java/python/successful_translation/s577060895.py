
import math

def main():
    n = int(input())
    sqrt = math.sqrt(n)
    near_num = math.floor(sqrt)
    ans = int(near_num ** 2)
    print(ans)

if __name__ == "__main__":
    main()

