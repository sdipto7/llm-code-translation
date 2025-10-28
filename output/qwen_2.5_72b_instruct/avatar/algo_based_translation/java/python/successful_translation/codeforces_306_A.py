
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    m = int(input[1])
    a = [0] * m
    if n % m == 0:
        for i in range(m):
            a[i] = n // m
    else:
        sub = n // m
        for i in range(m):
            a[i] = sub
        test = n - (sub * m)
        count = 0
        for i in range(test):
            a[count] += 1
            count += 1
            if count > len(a):
                count = 0
    for i in range(m-1, -1, -1):
        print(a[i], end=" ")

if __name__ == "__main__":
    main()

