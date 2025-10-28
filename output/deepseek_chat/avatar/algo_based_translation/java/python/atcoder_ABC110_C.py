
import sys

def main():
    S = input().strip()
    T = input().strip()
    A = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    res = True
    for s in A:
        sIdx = S.find(s)
        if sIdx < 0:
            continue
        t = T[sIdx]
        idx = 0
        while idx < len(S):
            s_pos = S.find(s, idx)
            if s_pos >= 0:
                t_pos = T.find(t, idx)
                if s_pos != t_pos:
                    res = False
                    break
                else:
                    idx = s_pos + 1
            else:
                t_pos = T.find(t, idx)
                if t_pos >= 0:
                    res = False
                    break
                else:
                    break
        if not res:
            break
    print("Yes" if res else "No")

if __name__ == "__main__":
    main()

