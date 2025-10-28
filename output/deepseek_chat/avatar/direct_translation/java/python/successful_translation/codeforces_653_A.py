
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a = sorted(list(set(a)))
    found = False
    for i in range(len(a)):
        if i + 1 < len(a) and i + 2 < len(a):
            if a[i] + 1 == a[i + 1] and a[i + 1] + 1 == a[i + 2]:
                found = True
    print("YES" if found else "NO")

if __name__ == "__main__":
    main()

