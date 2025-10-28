
import sys

def sub(a, b):
    min_val = min(a, b)
    max_val = max(a, b)
    result = 0
    while min_val > 0:
        result += max_val // min_val
        max_val = max_val % min_val
        curr_min = min(min_val, max_val)
        curr_max = max(min_val, max_val)
        min_val = curr_min
        max_val = curr_max
    return result

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    index = 1
    for i in range(n):
        a = int(data[index])
        b = int(data[index + 1])
        index += 2
        print(sub(a, b))

if __name__ == "__main__":
    main()

