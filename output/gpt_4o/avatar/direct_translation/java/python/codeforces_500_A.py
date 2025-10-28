
def dfs(currpos, arr, target):
    if currpos == target:
        return True
    if currpos == len(arr) + 1:
        return False
    teleport = dfs(currpos + arr[currpos - 1], arr, target)
    if teleport:
        return True
    return False

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    goal = int(data[1])
    arr = list(map(int, data[2:n]))
    isFound = dfs(1, arr, goal)
    if isFound:
        print("YES")
    else:
        print("NO")

