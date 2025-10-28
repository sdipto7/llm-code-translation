
def main():
    A1, A2, A3 = map(int, input().split())
    total = A1 + A2 + A3
    print("bust" if total >= 22 else "win")

if __name__ == "__main__":
    main()

