
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    numbers = data[1:n+1]
    unique_numbers = set(numbers)
    print(len(unique_numbers))

if __name__ == "__main__":
    main()

