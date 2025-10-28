
import sys

class Main:
    def main():
        n = int(sys.stdin.readline().strip())
        h = list(map(int, sys.stdin.readline().strip().split()))
        if len(h) != n:
            h = [int(sys.stdin.readline().strip()) for _ in range(n)]
        max_count = 0
        l = 0
        while l < n - 1:
            count = 0
            while l < n - 1 and h[l] >= h[l + 1]:
                l += 1
                count += 1
            max_count = max(max_count, count)
            l += 1
        print(max_count)

if __name__ == "__main__":
    Main.main()

