
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    mod = 1000000007
    index = 0
    n = int(input[index])
    index += 1
    q = int(input[index])
    index += 1
    c = list(input[index])
    index += 1
    range = [[0 for _ in range(2)] for _ in range(q)]
    for i in range(q):
        range[i][0] = int(input[index])
        index += 1
        range[i][1] = int(input[index])
        index += 1
    frag = [0] * (n + 1)
    rui = [0] * (n + 1)
    for i in range(2, n + 1):
        if c[i - 2] == 'A' and c[i - 1] == 'C':
            frag[i] += 1
        rui[i] = rui[i - 1] + frag[i]
    for i in range(q):
        left = range[i][0]
        right = range[i][1]
        print(rui[right] - rui[left])

if __name__ == "__main__":
    main()

