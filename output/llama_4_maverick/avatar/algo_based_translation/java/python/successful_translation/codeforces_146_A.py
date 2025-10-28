
def main():
    n = int(input())
    str = input()
    l = list(str)
    t = 0
    for i in range(n):
        if l[i] != '4' and l[i] != '7':
            t = 1
    if t == 1:
        print("NO")
    else:
        x = sum(int(l[i]) for i in range(n // 2))
        y = sum(int(l[i]) for i in range(n - 1, n // 2 - 1, -1))
        if x == y:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

