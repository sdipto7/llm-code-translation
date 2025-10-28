
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))[:n]
    a = sorted(list(set(a)))
    found = False
    for i in range(len(a) - 2):
        if a[i] + 1 == a[i+1] and a[i+1] + 1 == a[i+2]:
            found = True
            break
    print("YES" if found else "NO")

if __name__ == "__main__":
    main()

