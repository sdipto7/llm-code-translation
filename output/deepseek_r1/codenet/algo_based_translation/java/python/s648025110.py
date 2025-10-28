
def main():
    n = int(input())
    h = [int(input()) for _ in range(n)]
    ans = 0
    out = 0
    for num in h:
        if out < num:
            ans += num - out
            out = num
        else:
            out = num
    print(ans)

if __name__ == "__main__":
    main()

