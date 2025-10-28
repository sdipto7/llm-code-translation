
import sys

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read
    data = input().split()
    
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
            sb = []
            x = b[i]
            sss = []
            sss.append(str(i))
            sb.append(" " + "".join(reversed(sss)))
            s = 1
            while not st[x] and num[x] == 1 and x != 0 and a[x] != 1:
                sss = []
                sss.append(str(x))
                sb.append(" " + "".join(reversed(sss)))
                st[x] = True
                x = b[x]
                s += 1
            if s > ans:
                ans = s
                ss = "".join(reversed(sb))
    
    print(ans)
    print(ss)

if __name__ == "__main__":
    main()

