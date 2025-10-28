
def main():
    n = int(input())
    f = 0
    a = list(map(int, input().split()))
    for k in range(n):
        t = a[k]
        for i in range(n):
            for j in range(n):
                if i != j and j != k and i != k and t == (a[i] + a[j]):
                    f = 1
                    break
            if f == 1:
                break
        if f == 1:
            break
    if f == 1:
        print(k + 1, j + 1, i + 1)
    else:
        print(-1)

if __name__ == "__main__":
    main()

