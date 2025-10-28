
import sys

def main():
    import sys
    from io import StringIO
    import sys
    import sys

    sc = sys.stdin
    A = int(sc.readline().strip())
    B = int(sc.readline().strip())
    amari = 0
    result = 0
    result = (B - 1) // (A - 1)
    amari = (B - 1) % (A - 1)
    if amari != 0:
        result += 1
    print(result)

if __name__ == "__main__":
    main()

