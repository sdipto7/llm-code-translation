
import math

def main():
    x = int(input().strip())
    if x != 2 and x % 2 == 0:
        x += 1
    while True:
        sqrt_num = math.sqrt(x)
        i = 3
        found = False
        while i <= sqrt_num:
            if x % i == 0:
                found = True
                break
            i += 2
        if not found:
            break
        x += 2
    print(x)

if __name__ == "__main__":
    main()

