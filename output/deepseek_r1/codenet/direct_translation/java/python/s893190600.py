Here's the translated Python code:


H, W = map(int, input().split())
if H == 1 and W == 1:
    print("No")
    exit()

grid = [['.'] * (W + 2) for _ in range(H + 2)]
for i in range(1, H + 1):
    line = input().strip()
    for j in range(1, W + 1):
        grid[i][j] = line[j-1]

for i in range(1, H + 1):
    for j in range(1, W + 1):
        if grid[i][j] == '#':
            if (grid[i-1][j] != '#' and
                grid[i+1][j] != '#' and
                grid[i][j-1] != '#' and
                grid[i][j+1] != '#'):
                print("No")
                exit()

print("Yes")

