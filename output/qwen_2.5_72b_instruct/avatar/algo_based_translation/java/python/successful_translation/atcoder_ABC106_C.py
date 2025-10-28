
import sys

def main():
    import sys
    from io import StringIO
    import sys
    import sys
    import sys
    import sys
    import sys

    input = sys.stdin.read().split()
    str = input[0]
    c = list(str)
    k = int(input[1])
    n = len(str)
    for i in range(k):
        if c[i] == '1':
            if i == k - 1:
                print(1)
                return
        else:
            print(c[i])
            return

if __name__ == "__main__":
    main()

