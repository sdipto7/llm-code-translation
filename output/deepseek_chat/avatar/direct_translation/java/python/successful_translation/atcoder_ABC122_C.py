
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    q = int(data[1])
    c = list(data[2])
    ranges = [tuple(map(int, data[3 + 2 * i:5 + 2 * i])) for i in range(q)]
    frag = [0] * (n + 1)
    rui = [0] * (n + 1)
    for i in range(2, n + 1):
        if c[i - 2] == 'A' and c[i - 1] == 'C':
            frag[i] += 1
        rui[i] = rui[i - 1] + frag[i]
    for r in ranges:
        left, right = r
        print(rui[right] - rui[left])

if __name__ == "__main__":
    main()

