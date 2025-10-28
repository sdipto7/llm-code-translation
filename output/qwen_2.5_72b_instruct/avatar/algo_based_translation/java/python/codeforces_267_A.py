
import sys

def sub(a, b):
    min_val = min(a, b)
    max_val = max(a, b)
    result = 0
    while min_val > 0:
        result += max_val // min_val
        max_val = max_val % min_val
        min_val, max_val = min(min_val, max_val), max(min_val, max_val)
    return result

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    index = 1
    for _ in range(n):
        a = int(input[index])
        b = int(input[index + 1])
        index += 2
        print(sub(a, b))

if __name__ == "__main__":
    main()

