
import sys

def main():
    data = sys.stdin.read().split()
    index = 0
    while index < len(data):
        n = int(data[index])
        index += 1
        a = [0] * n
        b = [0] * n
        s = -1
        for i in range(n):
            a[i] = int(data[index])
            index += 1
            b[i] = 0
        tem = 1
        q = 0
        while q != n:
            s += 1
            if tem == 1:
                for i in range(n):
                    if a[i] <= q and b[i] == 0:
                        b[i] = 1
                        q += 1
                tem = 0
            else:
                for i in range(n-1, -1, -1):
                    if a[i] <= q and b[i] == 0:
                        b[i] = 1
                        q += 1
                tem = 1
        print(s)

if __name__ == "__main__":
    main()

