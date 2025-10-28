
def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    s = list(data[0])
    t = list(data[1])
    check = False
    
    for i in range(len(s) - len(t), -1, -1):
        check2 = True
        for j in range(len(t)):
            if s[i + j] != '?' and s[i + j] != t[j]:
                check2 = False
        if check2:
            check = True
            for j in range(len(t)):
                s[i + j] = t[j]
        if check:
            break
    
    if check:
        result = ''.join(['a' if ch == '?' else ch for ch in s])
        print(result)
    else:
        print("UNRESTORABLE")

if __name__ == "__main__":
    main()

