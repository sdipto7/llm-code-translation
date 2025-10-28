
import sys

def main():
    scanner = sys.stdin
    n = int(scanner.readline().strip())
    x = int(scanner.readline().strip())
    print_output(x, n)

def print_output(x, n):
    max_value = n * 2 - 1
    if x == 1 or x == max_value:
        print("No")
        return
    print("Yes")
    sep = '\n'
    ans = ''.join(f"{(e % max_value + 1)}{sep}" for e in range(x + n - 1, x + n + max_value - 1))
    print(ans, end='')

if __name__ == "__main__":
    main()

