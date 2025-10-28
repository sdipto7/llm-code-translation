
def main():
    A, B, n = map(int, input().split())
    if A == 0:
        if B == 0:
            print(1)
        else:
            print("No solution")
        return
    if B % A != 0:
        print("No solution")
        return
    B //= A
    neg = B < 0
    if neg and n % 2 == 0:
        print("No solution")
        return
    if neg:
        B = -B
    for x in range(int(B) + 1):
        if x ** n == B:
            if neg:
                print(-x)
            else:
                print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()

