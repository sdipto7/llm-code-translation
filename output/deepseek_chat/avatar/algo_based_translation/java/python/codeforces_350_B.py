
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    index = 1
    a = [0] * (n + 1)
    b = [0] * (n + 1)
    num = [0] * (n + 1)
    
    for i in range(1, n + 1):
        a[i] = int(data[index])
        index += 1
        
    for i in range(1, n + 1):
        b[i] = int(data[index])
        index += 1
        
    for i in range(1, n + 1):
        num[b[i]] += 1
        
    ss = ""
    ans = 0
    st = [False] * (n + 1)
    
    for i in range(1, n + 1):
        if a[i] == 1:
            st[i] = True
            sb_parts = []
            x = b[i]
            sb_parts.append(str(i))
            s = 1
            
            while x != 0 and not st[x] and num[x] == 1 and a[x] != 1:
                sb_parts.append(str(x))
                st[x] = True
                x = b[x]
                s += 1
                
            if s > ans:
                ans = s
                ss = " ".join(reversed(sb_parts))
                
    print(ans)
    if ans > 0:
        print(ss)
    else:
        print()

if __name__ == "__main__":
    main()

