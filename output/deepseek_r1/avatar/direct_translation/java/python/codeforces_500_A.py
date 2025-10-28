
import sys

def dfs(currentpos, arr, target):
    if currentpos == target:
        return True
    if currentpos == len(arr) + 1:
        return False
    return dfs(currentpos + arr[currentpos - 1], arr, target)

data = list(map(int, sys.stdin.read().split()))
n, goal = data[0], data[1]
arr = data[2:2 + (n - 1)] if n > 1 else []

print("YES" if dfs(1, arr, goal) else "NO")

