
import sys

def main():
    import sys
    from io import StringIO

    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    a = list(map(int, data[1:]))

    swapCount = 0

    for i in range(n):
        mini = i
        for j in range(i, n):
            if a[j] < a[mini]:
                mini = j
        if mini != i:
            v = a[mini]
            a[mini] = a[i]
            a[i] = v
            swapCount += 1

    ans = ' '.join(map(str, a))
    print(ans)
    print(swapCount)

if __name__ == "__main__":
    main()

