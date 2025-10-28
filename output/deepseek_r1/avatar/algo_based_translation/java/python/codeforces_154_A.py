
import sys

def main():
    s = sys.stdin.readline().strip()
    K = int(sys.stdin.readline())
    res = 0
    for _ in range(K):
        pair = sys.stdin.readline().strip()
        a, b = 0, 0
        for char in s:
            if char == pair[0]:
                a += 1
            elif char == pair[1]:
                b += 1
            else:
                res += min(a, b)
                a, b = 0, 0
        res += min(a, b)
    print(res)

if __name__ == "__main__":
    main()

