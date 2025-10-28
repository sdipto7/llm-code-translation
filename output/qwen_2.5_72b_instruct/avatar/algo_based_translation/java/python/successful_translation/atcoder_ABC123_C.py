
import math

def p(ans):
    print(ans)

def main():
    import sys
    import sys
    import sys
    import sys
    sc = sys.stdin
    N = int(sc.readline())
    min_val = 0
    for i in range(5):
        if i == 0:
            min_val = int(sc.readline())
        else:
            min_val = min(min_val, int(sc.readline()))
    p(math.ceil(N / min_val) + 4)

if __name__ == "__main__":
    main()

