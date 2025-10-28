
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))

    swap_count = 0

    for i in range(len(a)):
        mini = i
        for j in range(i, len(a)):
            if a[j] < a[mini]:
                mini = j
        if mini != i:
            a[mini], a[i] = a[i], a[mini]
            swap_count += 1

    ans = " ".join(map(str, a))
    print(ans)
    print(swap_count)

if __name__ == "__main__":
    main()

