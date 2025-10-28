
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    index = 1
    s = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")
    k = [list(seq) for seq in s]
    while n > 0:
        c = list(data[index])
        index += 1
        l = -1
        a = 0
        for i in range(len(c)):
            if c[i] != '0':
                a = ord(c[i]) - ord('1')
                l = (l + 1) % len(k[a])
            elif l >= 0:
                print(k[a][l], end='')
                l = -1
        print()
        n -= 1

main()

