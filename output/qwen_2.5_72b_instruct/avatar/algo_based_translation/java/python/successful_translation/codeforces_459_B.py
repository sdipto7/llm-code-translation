
import sys

def main():
    import sys
    from collections import Counter

    input = sys.stdin.read().split()
    N = int(input[0])
    A = list(map(int, input[1:N+1]))
    A.sort()
    min_val = A[0]
    max_val = A[N-1]
    counter = Counter(A)
    mins = counter[min_val]
    maxs = counter[max_val]
    if min_val == max_val:
        print(f"{max_val - min_val} {mins * (mins - 1) // 2}")
    else:
        print(f"{max_val - min_val} {mins * maxs}")

if __name__ == "__main__":
    main()

