
def dfs(currpos, arr, target):
    if currpos == target:
        return True
    if currpos > len(arr) or currpos < 1:
        return False
    return dfs(currpos + arr[currpos - 1], arr, target)

def main():
    try:
        n, goal = map(int, input().split())
        arr = list(map(int, input().split()))
        isFound = dfs(1, arr, goal)
        if isFound:
            print("YES")
        else:
            print("NO")
    except Exception:
        pass

if __name__ == "__main__":
    main()

