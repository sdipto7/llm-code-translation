
import sys

def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_val = a * a + b * b
    if count > max_val:
        print("NO")
        return
    print("YES")
    for i in range(n):
        sb = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                sb.append('L')
                count -= 1
            else:
                sb.append('S')
        print(''.join(sb))

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    count = int(data[1])
    print_island(n, count)

if __name__ == "__main__":
    main()

