
import sys

def isLatinLetter(c):
    return 'a' <= c <= 'z'

def isPunctuation(c):
    return c in {'.', ',', '!', '?'}

def main():
    s = sys.stdin.readline().strip()
    sb = [s[0]]
    n = len(s)
    for i in range(1, n):
        c = s[i]
        if isLatinLetter(c):
            if not isLatinLetter(s[i - 1]):
                sb.append(' ')
            sb.append(c)
        elif isPunctuation(c):
            sb.append(c)
    print(''.join(sb))

if __name__ == "__main__":
    main()

