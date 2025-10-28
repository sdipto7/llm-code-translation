
def main():
    n = int(input())
    arr = list(map(int, input().split()))
    for i in range(n):
        max_diff = max(abs(arr[i] - arr[0]), abs(arr[-1] - arr[i]))
        if i == 0:
            min_diff = arr[i + 1] - arr[i]
        elif i == n - 1:
            min_diff = arr[i] - arr[i - 1]
        else:
            min_diff = min(arr[i] - arr[i - 1], arr[i + 1] - arr[i])
        print(min_diff, max_diff)

if __name__ == "__main__":
    main()

