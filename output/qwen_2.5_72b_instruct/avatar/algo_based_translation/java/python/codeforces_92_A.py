
import sys

def main():
    import sys
    import sys
    from sys import stdin

    input = stdin.read().split()
    n = int(input[0])
    k = int(input[1])
    i = 1
    req = 1

    while k - req >= 0:
        k = k - req
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n

    print(k)

if __name__ == "__main__":
    main()

