
import sys

def main():
    import sys
    from io import StringIO
    import re

    input_data = sys.stdin.read().strip()
    S, T = input_data.split('\n')

    A = "abcdefghijklmnopqrstuvwxyz"
    res = True

    for s in A:
        sIdx = S.find(s)
        if sIdx < 0:
            continue
        t = T[sIdx]
        idx = 0
        while idx < len(S):
            if S.find(s, idx) >= 0:
                if S.find(s, idx) != T.find(t, idx):
                    res = False
                    break
                else:
                    idx = S.find(s, idx) + 1
            elif T.find(t, idx) >= 0:
                res = False
                break
            else:
                break
        if not res:
            break

    if res:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

