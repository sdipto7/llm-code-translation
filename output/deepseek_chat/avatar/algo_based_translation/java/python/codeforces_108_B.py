
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    a = list(map(int, data[1:1+n]))
    a.sort()
    for i in range(len(a) - 1):
        if a[i+1] < a[i] * 2 and a[i] != a[i+1]:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()

