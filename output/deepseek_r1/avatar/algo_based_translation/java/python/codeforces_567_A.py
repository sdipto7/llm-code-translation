
import sys

def main():
    a = int(sys.stdin.readline())
    ar = list(map(int, sys.stdin.readline().split()))
    for i in range(a):
        current = ar[i]
        max_val = max(current - ar[0], ar[-1] - current)
        if i == 0:
            min_val = ar[1] - current
        elif i == a - 1:
            min_val = current - ar[-2]
        else:
            min_val = min(current - ar[i-1], ar[i+1] - current)
        print(f"{min_val} {max_val}")

if __name__ == "__main__":
    main()

