
def dfs(currpos, arr, target):
    if currpos == target:
        return True
    if currpos == len(arr) + 1:
        return False
    next_pos = currpos + arr[currpos - 1]
    return dfs(next_pos, arr, target)

n, goal = map(int, input().split())
arr = list(map(int, input().split()))
is_found = dfs(1, arr, goal)
print("YES" if is_found else "NO")

