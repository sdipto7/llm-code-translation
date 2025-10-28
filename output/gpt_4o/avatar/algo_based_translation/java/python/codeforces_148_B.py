
import sys

def main():
    in_values = sys.stdin.read().strip().split()
    VP = int(in_values[0])  # Princess's speed
    VD = int(in_values[1])  # Dragon's speed
    T = int(in_values[2])   # Initial lead time
    F = int(in_values[3])   # Time for dragon to return after catching princess
    C = int(in_values[4])   # Distance to the castle

    if VD <= VP:
        print(0)
        return

    answer = 0
    start = T

    while True:
        x = start * VP / (VD - VP)
        if (start + x) * VP >= C:
            break
        start += 2 * x + F
        answer += 1

    print(answer)

if __name__ == "__main__":
    main()

