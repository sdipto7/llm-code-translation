
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    numbers = [int(data[i + 1]) for i in range(N)]

    count = 0

    while True:
        numbers = [i // 2 for i in numbers if i % 2 == 0]
        if len(numbers) == N:
            count += 1
        else:
            break

    print(count)

if __name__ == "__main__":
    main()

