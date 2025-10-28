
def main():
    import sys

    # Input operations
    x, y, a, b = map(int, sys.stdin.readline().split())

    # Variable declarations
    j = 2
    c = max(x, y)
    ans = True

    # Logic flow
    if c > b:
        print("0")
        ans = False

    # Control structures
    while c % min(x, y) != 0 and ans:
        if x > y:
            c = x * j
            j += 1
        else:
            c = y * j
            j += 1
        if c > b:
            print("0")
            ans = False
            break

    # Conditional structures
    if ans:
        count = 0
        i = a
        for i in range(a, b + 1):
            if i % c == 0:
                break
        if i != b + 1:
            print(((b - i) // c) + 1)
        else:
            print("0")

if __name__ == "__main__":
    main()

