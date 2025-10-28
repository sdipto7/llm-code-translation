
import sys

def dfs(curr_pos, arr, target):
    if curr_pos == target:
        return True
    if curr_pos == len(arr) + 1:
        return False
    teleport = dfs(curr_pos + arr[curr_pos - 1], arr, target)
    if teleport:
        return True
    return False

def main():
    n = int(sys.stdin.readline())
    goal = int(sys.stdin.readline())
    arr = [int(sys.stdin.readline()) for _ in range(n - 1)]
    is_found = dfs(1, arr, goal)
    if is_found:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

