
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    l = 0
    c = 1
    index = 2
    for i in range(n):
        a = int(data[index])
        index += 1
        if a == l:
            c += 1
        else:
            c = 1
        l = a
    if c + k > n:
        print(n - c)
    else:
        print(-1)

if __name__ == "__main__":
    main()

