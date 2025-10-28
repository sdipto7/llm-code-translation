
def print_func(x, n):
    max_val = 2 * n - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    seq = [((i % max_val) + 1) for i in range(x + n - 1, x + n + max_val - 1)]
    print("\n".join(map(str, seq)))

def main():
    n, x = map(int, input().split())
    print_func(x, n)

if __name__ == "__main__":
    main()

