import sys

def main():
    import sys
    import re
    input = sys.stdin.read().split()
    s = list(input[0])
    t = list(input[1])
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
        for char in s:
            if char == '?':
                print('a', end='')
            else:
                print(char, end='')
        print()
    else:
        print("UNRESTORABLE")

if __name__ == "__main__":
    main()
