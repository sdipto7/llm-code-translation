
def main():
    s = input()
    t = input()
    flag = False
    for _ in range(len(s)):
        s = rotate(s)
        if t == s:
            flag = True
            break
    print("Yes" if flag else "No")

def rotate(s):
    return s[1:] + s[0]

if __name__ == "__main__":
    main()

