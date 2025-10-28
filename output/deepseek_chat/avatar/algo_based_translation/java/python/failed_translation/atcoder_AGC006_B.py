
import sys

def main():
    n = int(input())
    x = int(input())
    print_func(x, n)

def print_func(x, n):
    max_val = n * 2 - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    sep = '\n'
    start = x + n - 1
    end = x + n + max_val - 1
    result = []
    for e in range(start, end):
        num = (e % max_val) + 1
        result.append(str(num))
    ans = sep.join(result)
    print(ans)

if __name__ == "__main__":
    main()

