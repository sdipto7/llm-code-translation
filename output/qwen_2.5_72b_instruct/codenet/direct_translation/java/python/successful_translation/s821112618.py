import sys

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
    k = [list(x) for x in s]
    index = 1
    while n > 0:
        c = list(data[index])
        l = -1
        a = 0
        for i in range(len(c)):
            if c[i] != '0':
                a = int(c[i]) - 1
                l = (l + 1) % len(k[a])
            elif l >= 0:
                print(k[a][l], end='')
                l = -1
        print()
        n -= 1
        index += 1

if __name__ == "__main__":
    main()
