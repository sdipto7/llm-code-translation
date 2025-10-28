
def print_sequence(x, n):
    max_val = 2 * n - 1
    if x == 1 or x == max_val:
        print("No")
        return
    print("Yes")
    start = x + n - 1
    ans = ''.join(f"{(e % max_val) + 1}\n" for e in range(start, start + max_val))
    print(ans)

if __name__ == "__main__":
    n, x = map(int, input().split())
    print_sequence(x, n)

