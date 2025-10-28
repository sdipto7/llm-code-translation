n = int(input())
grid = [input().strip() for _ in range(n)]
a, b = grid[0][0], grid[0][1]
if a == b:
    print("NO")
else:
    res = True
    for i in range(n):
        for j in range(n):
            if i == j or i + j == n - 1:
                if grid[i][j] != a:
                    res = False
                    break
            else:
                if grid[i][j] != b:
                    res = False
                    break
    print("YES" if res else "NO")
