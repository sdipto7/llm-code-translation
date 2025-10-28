
def main():
    n = int(input())
    a = [0] * (n + 1)
    b = [0] * (n + 1)
    num = [0] * (n + 1)

    inputs = list(map(int, input().split()))
    for i in range(1, n + 1):
        a[i] = inputs[i - 1]

    inputs = list(map(int, input().split()))
    for i in range(1, n + 1):
        b[i] = inputs[i - 1]

    for i in range(1, n + 1):
        num[b[i]] += 1

    ss = ""
    ans = 0
    st = [False] * (n + 1)

    for i in range(1, n + 1):
        if a[i] == 1:
            st[i] = True
            sb = str(i)
            x = b[i]
            s = 1
            while not st[x] and num[x] == 1 and x != 0 and a[x] != 1:
                sb += " " + str(x)
                st[x] = True
                x = b[x]
                s += 1
            if s > ans:
                ans = s
                ss = ' '.join(sb.split()[::-1])

    print(ans)
    print(ss)

if __name__ == "__main__":
    main()

