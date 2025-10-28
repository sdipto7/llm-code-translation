
def main():
    n = int(input())
    result = (n // 3) * 2 + (0 if n % 3 == 0 else 1)
    print(result)

if __name__ == "__main__":
    main()

