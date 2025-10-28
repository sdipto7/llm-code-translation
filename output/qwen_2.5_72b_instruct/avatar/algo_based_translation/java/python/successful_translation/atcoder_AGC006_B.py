
import sys

def print_sequence(x, n):
    max_val = n * 2 - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    sep = '\n'
    ans = sep.join(str((e % max_val + 1)) for e in range(x + n - 1, x + n + max_val - 1))
    print(ans)

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    x = int(input[1])
    print_sequence(x, n)

if __name__ == "__main__":
    main()

