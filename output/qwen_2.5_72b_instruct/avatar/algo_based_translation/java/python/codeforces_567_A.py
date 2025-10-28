
import sys

def main():
    import sys
    from ast import literal_eval

    input = sys.stdin.read().split()
    a = int(input[0])
    ar = list(map(int, input[1:]))

    max_val = 0
    min_val = 0

    for i in range(a):
        max_val = max(ar[i] - ar[0], ar[a - 1] - ar[i])
        if i == 0:
            min_val = ar[i + 1] - ar[i]
        elif i == a - 1:
            min_val = ar[i] - ar[i - 1]
        else:
            min_val = min(ar[i] - ar[i - 1], ar[i + 1] - ar[i])
        print(min_val, max_val)

if __name__ == "__main__":
    main()

