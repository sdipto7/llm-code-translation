
def main():
    import sys
    n = int(sys.stdin.readline().strip())
    l = []
    r = []
    for _ in range(n):
        left, right = map(int, sys.stdin.readline().strip().split())
        l.append(left)
        r.append(right)
    sum_val = 0
    for i in range(n):
        sum_val += r[i] - l[i] + 1
    print(sum_val)

if __name__ == "__main__":
    main()

