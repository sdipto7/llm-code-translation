
import math

def p(ans=None):
    if ans is None:
        print()
    else:
        print(ans)

def main():
    N = int(input())
    min_val = float('inf')
    for _ in range(5):
        val = int(input())
        min_val = min(min_val, val)
    p(math.ceil(N / min_val) + 4)

if __name__ == "__main__":
    main()

