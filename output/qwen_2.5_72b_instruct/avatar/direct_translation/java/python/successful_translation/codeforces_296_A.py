import sys

def main():
    import sys
    from collections import defaultdict
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    array = defaultdict(int)
    index = 1
    for i in range(n):
        array[int(data[index])] += 1
        index += 1
    countMax = -1
    for i in range(1, 1002):
        if countMax < array[i]:
            countMax = array[i]
    if n % 2 == 0:
        if countMax <= n // 2:
            print("YES")
        else:
            print("NO")
    else:
        if countMax <= n // 2 + 1:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()
