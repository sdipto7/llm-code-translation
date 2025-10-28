
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
    k = [list(segment) for segment in s]

    index = 1
    for _ in range(n):
        c = list(data[index])
        index += 1

        l = -1
        a = 0
        for char in c:
            if char != '0':
                a = ord(char) - ord('1')
                l = (l + 1) % len(k[a])
            elif l >= 0:
                print(k[a][l], end='')
                l = -1
        print()

if __name__ == "__main__":
    main()

