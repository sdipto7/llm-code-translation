
def min_helper(arr, n):
    if n == 1:
        return 0
    elif n == 2:
        return abs(arr[1] - arr[0])
    else:
        op1 = abs(arr[n-1] - arr[n-2]) + min_helper(arr, n-1)
        op2 = abs(arr[n-1] - arr[n-3]) + min_helper(arr, n-2)
        return min(op1, op2)

def dpc(arr, i, n, row):
    if row == n:
        return 0
    if i == 1:
        j, k = 0, 2
    elif i == 0:
        j, k = 1, 2
    else:
        j, k = 0, 1
    return arr[row][i] + max(dpc(arr, j, n, row + 1), dpc(arr, k, n, row + 1))

def dpx(arr, n):
    dp = [[0] * 3 for _ in range(n)]
    dp[0][0], dp[0][1], dp[0][2] = arr[0][0], arr[0][1], arr[0][2]
    
    for i in range(1, n):
        for in_col in range(3):
            if in_col == 1:
                j, k = 0, 2
            elif in_col == 0:
                j, k = 1, 2
            else:
                j, k = 0, 1
            dp[i][in_col] = max(dp[i-1][j], dp[i-1][k]) + arr[i][in_col]
    
    return max(dp[n-1][0], dp[n-1][1], dp[n-1][2])

if __name__ == "__main__":
    import sys
    input = sys.stdin.read().split()
    ptr = 0
    n = int(input[ptr])
    ptr += 1
    arr = []
    for _ in range(n):
        row = list(map(int, input[ptr:ptr+3]))
        ptr += 3
        arr.append(row)
    print(dpx(arr, n))

