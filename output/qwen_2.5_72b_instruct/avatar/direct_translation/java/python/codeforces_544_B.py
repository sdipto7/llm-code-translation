
import sys

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    count = int(input[1])
    print_island(n, count)

def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_val = a * a + b * b
    if count > max_val:
        print("NO")
        return
    print("YES")
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        print(''.join(row))

if __name__ == "__main__":
    main()

