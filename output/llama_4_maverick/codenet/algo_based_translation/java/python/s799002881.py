
import math

def main():
    try:
        str = input().split(" ")
        n = int(str[0])
        d = int(str[1])
        cnt = 0

        for _ in range(n):
            str = input().split(" ")
            x = int(str[0])
            y = int(str[1])
            if math.sqrt(x*x + y*y) <= d:
                cnt += 1
        print(cnt)
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

