
import sys

def main():
    data = sys.stdin.readline().split()
    h = int(data[0])
    a = int(data[1])
    num = 0
    while h > 0:
        h -= a
        num += 1
    print(num)

if __name__ == "__main__":
    main()

