grid = [input().strip() for _ in range(4)]
yes = False
for u in range(3):
    for i in range(3):
        if (grid[u][i] == grid[u][i+1] and (grid[u+1][i] == grid[u][i] or grid[u+1][i+1] == grid[u][i])) or (grid[u+1][i] == grid[u+1][i+1] and (grid[u][i] == grid[u+1][i] or grid[u][i+1] == grid[u+1][i])):
            yes = True
            break
    if yes:
        break
print("YES" if yes else "NO")
