
class Main:
    def solve(self):
        N = int(input())
        max_val = min_val = int(input())
        for _ in range(1, N):
            in_val = int(input())
            max_val = max(max_val, in_val)
            min_val = min(min_val, in_val)
        print(max_val - min_val)

if __name__ == "__main__":
    Main().solve()

