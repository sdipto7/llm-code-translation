
def main():
    a, b = map(int, input().split())
    sum = 0
    for _ in range(2):
        if a >= b:
            sum += a
            a -= 1
        else:
            sum += b
            b -= 1
    print(sum)

if __name__ == "__main__":
    main()

