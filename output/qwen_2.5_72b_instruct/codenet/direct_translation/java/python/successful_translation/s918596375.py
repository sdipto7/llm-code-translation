
import sys

def main():
    import sys
    import sys
    from io import StringIO
    input = sys.stdin.read
    data = input().split()
    index = 0

    def next():
        nonlocal index
        result = data[index]
        index += 1
        return result

    def nextLine():
        nonlocal index
        result = data[index]
        index += 1
        return result

    def nextLong():
        return int(next())

    def nextInt():
        return int(next())

    def nextDouble():
        return float(next())

    def nextIntArray(n):
        return [nextInt() for _ in range(n)]

    def nextLongArray(n):
        return [nextLong() for _ in range(n)]

    s = next()
    a = ["a", "e", "i", "o", "u"]
    for str in a:
        if str.lower() == s.lower():
            print("vowel")
            return
    print("consonant")

if __name__ == "__main__":
    main()

