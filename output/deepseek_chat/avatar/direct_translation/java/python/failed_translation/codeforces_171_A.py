
import sys

def reverse(n):
    if n < 10:
        return n * 10
    t, r = n, 0
    while t > 0:
        r = (r * 10) + t % 10
        t = t // 10
    return r

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    t = reverse(m)
    print(t + n)

if __name__ == "__main__":
    main()

