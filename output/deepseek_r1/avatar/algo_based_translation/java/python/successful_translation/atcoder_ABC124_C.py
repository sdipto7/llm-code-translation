
import sys

def main():
    x = sys.stdin.readline().strip()
    a = list(x)
    b = list(x)
    a1 = 0
    for i in range(1, len(a)):
        if a[i] == a[i-1]:
            a[i] = '1' if a[i] == '0' else '0'
            a1 += 1
    a2 = 0
    for i in range(len(b)-1, 0, -1):
        if b[i] == b[i-1]:
            b[i-1] = '1' if b[i-1] == '0' else '0'
            a2 += 1
    print(min(a1, a2))

if __name__ == "__main__":
    main()

