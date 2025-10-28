
import sys

def main():
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    import sys
    sc = sys.stdin
    n = int(sc.readline())
    maxv = -sys.maxsize
    minv = int(sc.readline())
    for i in range(1, n):
        ri = int(sc.readline())
        maxv = max(maxv, ri - minv)
        minv = min(minv, ri)
    print(maxv)

if __name__ == "__main__":
    main()

