
import math
import sys

def main():
    import sys
    import math
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    sc = sys.stdin
    q = int(sc.readline().strip())
    while q > 0:
        n = int(sc.readline().strip())
        s = 0
        x = int(math.log(n) / math.log(2)) + 1
        s = -1 * pow(2, x) + 2 + (n * (n + 1)) // 2 - pow(2, x)
        print(s)
        q -= 1

if __name__ == "__main__":
    main()

