
import sys

def main():
    s = sys.stdin
    a = int(s.readline().strip())
    ar = [0] * a
    max_val = 0
    min_val = 0
    for i in range(len(ar)):
        ar[i] = int(s.readline().strip())
    for i in range(len(ar)):
        max_val = max(ar[i] - ar[0], ar[len(ar)-1] - ar[i])
        if i == 0:
            min_val = ar[i+1] - ar[i]
        elif i == len(ar)-1:
            min_val = ar[i] - ar[i-1]
        else:
            min_val = min(ar[i] - ar[i-1], ar[i+1] - ar[i])
        print(f"{min_val} {max_val}")

if __name__ == "__main__":
    main()

