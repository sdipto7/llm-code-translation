
def compare(aa, i, bb, j, m):
    while m > 0:
        a = aa[i].upper()
        b = bb[j].upper()
        if a != b:
            return ord(a) - ord(b)
        i += 1
        j += 1
        m -= 1
    return 0

def main():
    n = int(input())
    ss = [list(input()) for _ in range(n)]
    cc = list(input())
    c = input()[0]
    a = 'b' if c == 'a' else 'a'
    c_ = c.upper()
    a_ = a.upper()
    lucky = [False] * len(cc)
    for j in range(len(cc)):
        for s in ss:
            l = len(s)
            if len(cc) - j >= l and compare(cc, j, s, 0, l) == 0:
                for h in range(l):
                    lucky[j + h] = True
    for j in range(len(cc)):
        if lucky[j]:
            if cc[j].lower() == c:
                cc[j] = a_ if cc[j].isupper() else a
            else:
                cc[j] = c_ if cc[j].isupper() else c
    print(''.join(cc))

if __name__ == "__main__":
    main()

