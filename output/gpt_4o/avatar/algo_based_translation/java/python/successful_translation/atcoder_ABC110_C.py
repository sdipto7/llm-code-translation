
def atcoder_ABC110_C():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    S = data[0]
    T = data[1]
    
    A = [chr(i) for i in range(ord('a'), ord('z') + 1)]
    res = True
    
    for s in A:
        sIdx = S.find(s)
        if sIdx < 0:
            continue
        
        t = T[sIdx]
        idx = 0
        
        while idx < len(S):
            sPos = S.find(s, idx)
            tPos = T.find(t, idx)
            
            if sPos >= 0:
                if sPos != tPos:
                    res = False
                    break
                else:
                    idx = sPos + 1
            elif tPos >= 0:
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

atcoder_ABC110_C()

