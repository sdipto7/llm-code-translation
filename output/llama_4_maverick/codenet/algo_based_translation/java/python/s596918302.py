
def min_func(arr, n):
    if n == 1:
        return 0
    if n == 2:
        return abs(arr[n-1] - arr[n-2])
    op1 = abs(arr[n-1] - arr[n-2]) + min_func(arr, n-1)
    op2 = abs(arr[n-1] - arr[n-3]) + min_func(arr, n-2)
    return min(op1, op2)

def dpc(arr, i, n, row):
    if row == n:
        return 0
    j, k = 0, 0
    if i == 1:
        j, k = 0, 2
    elif i == 0:
        j, k = 1, 2
    else:
        j, k = 0, 1
    return arr[row][i] + max(dpc(arr, j, n, row+1), dpc(arr, k, n, row+1))

def dpx(arr, n):
    dp = [[0]*3 for _ in range(n)]
    dp[0][0] = arr[0][0]
    dp[0][1] = arr[0][1]
    dp[0][2] = arr[0][2]
    for i in range(1, n):
        for inn in range(3):
            j, k = 0, 0
            if inn == 1:
                j, k = 0, 2
            elif inn == 0:
                j, k = 1, 2
            else:
                j, k = 0, 1
            dp[i][inn] = arr[i][inn] + max(dp[i-1][j], dp[i-1][k])
    return max(dp[n-1][0], dp[n-1][1], dp[n-1][2])

def main():
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    ans = dpx(arr, n)
    print(ans)

if __name__ == "__main__":
    main()

