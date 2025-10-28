
def print_result(x, n):
    max_val = n * 2 - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    ans = "\n".join(str((i % max_val + 1)) for i in range(x + n - 1, x + n + max_val - 1))
    print(ans)

def main():
    n, x = map(int, input().split())
    print_result(x, n)

if __name__ == "__main__":
    main()

