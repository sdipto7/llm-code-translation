
from sys import stdin

def dfs(currpos, arr, target):
    if currpos == target:
        return True
    if currpos > len(arr):
        return False
    teleport = dfs(currpos + arr[currpos - 1], arr, target)
    if teleport:
        return True
    return False

def main():
    import sys
    input = stdin.read().split()
    index = 0
    n = int(input[index])
    index += 1
    goal = int(input[index])
    index += 1
    arr = list(map(int, input[index:index + n - 1]))
    isFound = dfs(1, arr, goal)
    if isFound:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

