def main():
    n = int(input())
    a = [0] * n
    r = 0
    for i in range(n):
        a[i] = int(input())
        r ^= a[i]
    for i in range(n):
        if i != 0:
            print(" ", end='')
        print(r ^ a[i], end='')

if __name__ == "__main__":
    main()
