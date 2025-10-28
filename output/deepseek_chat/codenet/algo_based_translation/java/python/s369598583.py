
import sys

def main():
    N = int(input().strip())
    count = 0
    next_val = 10
    i = 1
    while i <= N:
        count += 1
        if i == next_val - 1:
            i = next_val * 10 - 1
            next_val *= 100
        i += 1
    print(count)

if __name__ == "__main__":
    main()

