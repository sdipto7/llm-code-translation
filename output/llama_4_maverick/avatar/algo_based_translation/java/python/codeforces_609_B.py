
def main():
    n, m = map(int, input().split())
    arr = [0] * n
    gen = [0] * 11
    for i in range(n):
        arr[i] = int(input())
        gen[arr[i]] += 1
    ans = 0
    for i in range(1, m + 1):
        for k in range(1, m + 1):
            if i != k:
                ans += gen[i] * gen[k]
    print(ans // 2)

if __name__ == "__main__":
    main()

