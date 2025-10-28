
import sys

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    x = int(input[1])
    print_result(x, n)

def print_result(x, n):
    max_val = n * 2 - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    ans = '\n'.join(str((e % max_val + 1)) for e in range(x + n - 1, x + n + max_val - 1))
    print(ans)

if __name__ == "__main__":
    main()

