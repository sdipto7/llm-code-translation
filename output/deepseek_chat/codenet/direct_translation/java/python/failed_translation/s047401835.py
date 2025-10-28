
import sys

def main():
    N = int(sys.stdin.readline())
    numbers = [int(sys.stdin.readline()) for _ in range(N)]
    count = 0

    while True:
        numbers = [num // 2 for num in numbers if num % 2 == 0]
        if len(numbers) == N:
            count += 1
        else:
            break

    print(count)

if __name__ == "__main__":
    main()

