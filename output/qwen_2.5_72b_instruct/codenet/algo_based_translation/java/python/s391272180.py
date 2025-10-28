
import sys

def Rotate(s):
    t = s[0]
    for i in range(len(s) - 1):
        s[i] = s[i + 1]
    s[-1] = t
    return ''.join(s)

def main():
    sc = sys.stdin.read().split()
    s = list(sc[0])
    t = list(sc[1])
    flag = False
    for i in range(len(s)):
        s = list(Rotate(s))
        if ''.join(t) == ''.join(s):
            flag = True
            break
    if flag:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

