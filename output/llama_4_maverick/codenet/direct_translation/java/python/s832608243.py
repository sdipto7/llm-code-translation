
import math

def main():
    a, b = map(int, input().split())
    flag = False
    for i in range(1, 100001):
        if math.floor(0.08 * i) == a and b == math.floor(0.1 * i):
            print(i)
            flag = True
            break
    if not flag:
        print(-1)

if __name__ == "__main__":
    main()

