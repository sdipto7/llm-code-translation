
import sys

def main():
    data = sys.stdin.read().splitlines()
    n, q = map(int, data[0].split())
    c = list(data[1].strip())
    ranges = []
    index = 2
    for i in range(q):
        l, r = map(int, data[index].split())
        ranges.append((l, r))
        index += 1
    
    frag = [0] * (n + 1)
    rui = [0] * (n + 1)
    
    for i in range(2, n + 1):
        if c[i - 2] == 'A' and c[i - 1] == 'C':
            frag[i] = 1
        rui[i] = rui[i - 1] + frag[i]
    
    for l, r in ranges:
        print(rui[r] - rui[l])

if __name__ == "__main__":
    main()

