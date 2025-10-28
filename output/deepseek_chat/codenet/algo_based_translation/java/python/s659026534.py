
import sys

def main():
    n = int(input().strip())
    count = 0
    for i in range(1, n + 1):
        count += i
    print(count)

if __name__ == "__main__":
    main()

