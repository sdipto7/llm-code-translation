
import sys

def main():
    s = list(input().strip())
    t = list(input().strip())
    check = False
    
    for i in range(len(s) - len(t), -1, -1):
        check2 = True
        for j in range(len(t)):
            if s[i + j] != '?' and s[i + j] != t[j]:
                check2 = False
                break
        
        if check2:
            check = True
            for j in range(len(t)):
                s[i + j] = t[j]
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

