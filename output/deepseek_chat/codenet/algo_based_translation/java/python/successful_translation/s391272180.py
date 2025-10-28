def rotate(s):
    if len(s) == 0:
        return s
    return s[1:] + s[0]

def main():
    s = input().strip()
    t = input().strip()
    flag = False
    
    for i in range(len(s)):
        s = rotate(s)
        if t == s:
            flag = True
            break
            
    if flag:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
