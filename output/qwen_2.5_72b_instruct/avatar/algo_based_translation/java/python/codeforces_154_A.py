import sys

def main():
    infile = sys.stdin
    arr = list(infile.readline().strip())
    N = len(arr)
    set_ = set()  # Unused in the logic
    K = int(infile.readline().strip())
    res = 0

    for _ in range(K):
        input_ = infile.readline().strip()
        a = 0
        b = 0

        for char in arr:
            if char == input_[0]:
                a += 1
            elif char == input_[1]:
                b += 1
            else:
                res += min(a, b)
                a = b = 0

        res += min(a, b)

    print(res)

if __name__ == "__main__":
    main()
