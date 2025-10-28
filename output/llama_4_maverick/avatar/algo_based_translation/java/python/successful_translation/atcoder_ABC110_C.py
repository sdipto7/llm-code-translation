
def main():
    S = input().strip()
    T = input().strip()
    res = True
    A = [chr(i) for i in range(ord('a'), ord('z')+1)]
    for s in A:
        sIdx = S.find(s)
        if sIdx < 0:
            continue
        t = T[sIdx]
        idx = 0
        while idx < len(S):
            s_idx_in_S = S.find(s, idx)
            t_idx_in_T = T.find(t, idx)
            if s_idx_in_S >= 0:
                if s_idx_in_S != t_idx_in_T:
                    res = False
                    break
                else:
                    idx = s_idx_in_S + 1
            elif t_idx_in_T >= 0:
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

