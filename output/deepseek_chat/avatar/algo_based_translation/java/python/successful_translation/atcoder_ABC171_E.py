
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    a = list(map(int, data[1:1+n]))
    r = 0
    for num in a:
        r ^= num
    result = []
    for i in range(n):
        result.append(str(r ^ a[i]))
    print(" ".join(result))

if __name__ == "__main__":
    main()

