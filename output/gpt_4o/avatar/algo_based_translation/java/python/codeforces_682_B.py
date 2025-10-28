
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    list_numbers = [int(data[i + 1]) for i in range(n)]
    list_numbers.sort()
    c = 1
    for number in list_numbers:
        if number >= c:
            c += 1
    print(c)

def debug(*obj):
    print(obj, file=sys.stderr)

if __name__ == "__main__":
    main()

