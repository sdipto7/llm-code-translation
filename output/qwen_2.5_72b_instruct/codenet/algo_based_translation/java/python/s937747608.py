
def main():
    import sys
    import io
    import contextlib

    @contextlib.contextmanager
    def stdinput(data):
        sys.stdin = io.StringIO(data)
        yield
        sys.stdin = sys.__stdin__

    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    if a * b >= c * d:
        print(a * b)
    elif a * b <= c * d:
        print(c * d)

if __name__ == "__main__":
    main()

