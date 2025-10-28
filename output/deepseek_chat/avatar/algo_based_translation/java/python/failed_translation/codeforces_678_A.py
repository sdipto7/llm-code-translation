
def main():
    import sys
    n = int(sys.stdin.readline())
    k = int(sys.stdin.readline())
    n += 1
    z = 0
    if n % k != 0:
        z = k - (n % k)
    print(n + z)

if __name__ == "__main__":
    main()

