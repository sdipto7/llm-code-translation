
def find_divisors_sequence(n):
    print(n, end=" ")
    m = n

    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=" ")
            m = i

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    n = int(input().strip())
    find_divisors_sequence(n)

