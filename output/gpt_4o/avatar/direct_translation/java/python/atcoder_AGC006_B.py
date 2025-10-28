
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    x = int(data[1])
    print_result(x, n)

def print_result(x, n):
    max_value = n * 2 - 1
    if x == 1 or x == max_value:
        print("No")
        return
    print("Yes")
    sep = "\n"
    ans = sep.join(str((e % max_value + 1)) for e in range(x + n - 1, x + n + max_value - 1))
    print(ans)

if __name__ == "__main__":
    main()

