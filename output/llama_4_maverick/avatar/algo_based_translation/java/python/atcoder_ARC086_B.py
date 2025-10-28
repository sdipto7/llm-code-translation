
def main():
    n = int(input())
    a = list(map(int, input().split()))
    m = max(range(n), key=lambda i: abs(a[i]))
    r = []
    for i in range(n):
        if (a[m] >= 0) ^ (a[i] >= 0):
            r.append(f"{m+1} {i+1}")
    if a[m] >= 0:
        for i in range(1, n):
            r.append(f"{i} {i+1}")
    else:
        for i in range(n, 1, -1):
            r.append(f"{i} {i-1}")
    print(len(r))
    for op in r:
        print(op)

if __name__ == "__main__":
    main()

