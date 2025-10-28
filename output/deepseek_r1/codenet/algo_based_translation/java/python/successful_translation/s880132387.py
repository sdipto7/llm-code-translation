
import sys

def main():
    while True:
        line = sys.stdin.readline()
        if not line:
            break
        W, H = map(int, line.strip().split())
        if W == 0 and H == 0:
            break
        grid = []
        for _ in range(H):
            row = sys.stdin.readline().strip()
            while not row:
                row = sys.stdin.readline().strip()
            grid.append(list(row))
        dp = [[0] * W for _ in range(H)]
        max_val = 0
        for h in range(H):
            for w in range(W):
                hprev = dp[h-1][w] if h > 0 else 0
                wprev = dp[h][w-1] if w > 0 else 0
                max_prev = max(hprev, wprev)
                if grid[h][w].isdigit():
                    current = max_prev * 10 + int(grid[h][w])
                    dp[h][w] = current
                    if current > max_val:
                        max_val = current
                else:
                    dp[h][w] = 0
        print(max_val)

if __name__ == "__main__":
    main()

