
import math

def main():
    N = int(input())
    min_val = float('inf')
    for _ in range(5):
        val = int(input())
        min_val = min(min_val, val)
    result = math.ceil(N / min_val) + 4
    print(result)

if __name__ == "__main__":
    main()

