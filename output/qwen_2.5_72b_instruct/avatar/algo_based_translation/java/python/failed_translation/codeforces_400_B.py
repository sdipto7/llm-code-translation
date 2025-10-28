from sys import stdin
from collections import HashSet

def main():
    import sys
    import sys
    from sys import stdin
    from collections import HashSet

    import sys
    import sys
    from sys import stdin
    from collections import HashSet

    sc = sys.stdin
    n = int(sc.readline().strip())
    m = int(sc.readline().strip())

    arrs = [sc.readline().strip() for _ in range(n)]
    length = [0] * n
    index = 0
    returnDex = 0

    for tmp in arrs:
        dexG = tmp.find("G")
        dexS = tmp.find("S")
        if dexG > dexS:
            returnDex = -1
        length[index] = dexS - dexG
        index += 1

    s = set(length)

    if returnDex == -1:
        print(returnDex)
    else:
        print(len(s))

if __name__ == "__main__":
    main()
