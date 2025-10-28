
import sys

def main():
    import sys
    import sys
    h1 = int(sys.stdin.readline())
    m1 = int(sys.stdin.readline())
    h2 = int(sys.stdin.readline())
    m2 = int(sys.stdin.readline())
    k = int(sys.stdin.readline())
    t1 = h1 * 60 + m1
    t2 = h2 * 60 + m2
    print(t2 - t1 - k)

if __name__ == "__main__":
    main()

