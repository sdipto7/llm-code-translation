
import sys

def main():
    import sys
    from io import StringIO

    input = sys.stdin.read().split()
    in_index = 0

    def read_int():
        nonlocal in_index
        result = int(input[in_index])
        in_index += 1
        return result

    a = read_int()
    b = read_int()
    c = 0

    if a == 1 and b == 1:
        print(0)
    else:
        while a >= 1 or b >= 1:
            if a >= b:
                b += 1
                a -= 2
            else:
                a += 1
                b -= 2
            if a <= 0 or b <= 0:
                c += 1
                break
            c += 1
        print(c)

if __name__ == "__main__":
    main()

