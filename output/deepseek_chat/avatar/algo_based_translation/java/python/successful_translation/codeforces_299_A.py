
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    a = list(map(int, data[1:1+n]))
    a.sort()
    min_val = a[0]
    for value in a:
        if value % min_val != 0:
            print(-1)
            return
    print(min_val)

if __name__ == "__main__":
    main()

