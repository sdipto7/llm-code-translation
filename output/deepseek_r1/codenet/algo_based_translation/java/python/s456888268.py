
import sys

def solve():
    s = sys.stdin.readline().strip()
    n = len(s)
    ans = 0
    cnt = 0
    for c in s:
        if c == 'S':
            cnt += 1
        else:
            if cnt > 0:
                ans += 1
                cnt -= 1
    print(n - 2 * ans)

if __name__ == "__main__":
    solve()

