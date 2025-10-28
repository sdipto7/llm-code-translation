
def main():
    import sys
    from typing import List

    def read_integers() -> List[int]:
        return list(map(int, sys.stdin.read().split()))

    integers = read_integers()
    n = integers[0]
    d = 0
    for i in range(1, n + 1):
        d += integers[i] % 2
    print("YES" if d % 2 == 0 else "NO")

if __name__ == "__main__":
    main()

