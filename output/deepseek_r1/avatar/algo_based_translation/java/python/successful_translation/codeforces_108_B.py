
def main():
    import sys
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a = a[:n]
    a.sort()
    for i in range(len(a) - 1):
        if a[i+1] < 2 * a[i] and a[i] != a[i+1]:
            print("YES")
            return
    print("NO")

if __name__ == "__main__":
    main()

