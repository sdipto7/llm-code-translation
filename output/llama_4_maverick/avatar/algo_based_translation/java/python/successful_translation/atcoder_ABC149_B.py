
def main():
    A, B, K = map(int, input().split())
    x = A
    y = B
    x = A - K
    if x < 0:
        y = B + x
        x = 0
        if y < 0:
            y = 0
    print(x, y)

if __name__ == "__main__":
    main()

