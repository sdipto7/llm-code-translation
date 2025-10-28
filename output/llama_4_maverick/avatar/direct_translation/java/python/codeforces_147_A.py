
import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = sys.stdin.readline().strip()
    sb = s[0]
    n = len(s)
    for i in range(1, n):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb += ' '
            sb += c
        elif is_punctuation(c):
            sb += c
    sys.stdout.write(sb + '\n')

if __name__ == "__main__":
    main()

