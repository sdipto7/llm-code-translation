
import sys

def main():
    args = sys.stdin.read().split()
    n = int(args[0])
    x = int(args[1])
    print_result(x, n)

def print_result(x, n):
    max_val = n * 2 - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    sep = '\n'
    ans = ''.join(str((i % max_val) + 1) + sep for i in range(x + n - 1, x + n + max_val - 1))
    print(ans)

if __name__ == "__main__":
    main()

