
def main():
    import sys
    import sys
    from sys import stdin

    input = stdin.read().split()
    n = int(input[0])
    f = 0
    a = [0] * n
    index = 1
    for i in range(n):
        a[i] = int(input[index])
        index += 1

    k = 0
    j = 0
    i = 0

    for k in range(n):
        t = a[k]
        found = False
        for i in range(n):
            for j in range(n - 1):
                if i != j and t == a[i] + a[j]:
                    f = 1
                    found = True
                    break
            if found:
                break
        if found:
            break

    if f == 1:
        print(k + 1, j + 1, i + 1)
    else:
        print(-1)

if __name__ == "__main__":
    main()

