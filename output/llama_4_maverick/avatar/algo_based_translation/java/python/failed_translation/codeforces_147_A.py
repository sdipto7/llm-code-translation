
import sys

def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_punctuation(c):
    return c in ['.', ',', '!', '?']

def main():
    s = sys.stdin.readline().strip()
    sb = []
    n = len(s)
    sb.append(s[0])
    for i in range(1, n):
        c = s[i]
        if is_latin_letter(c.lower()):
            if not is_latin_letter(s[i-1].lower()) and s[i-1] not in ['.', ',', '!', '?']:
                sb.append(' ')
            sb.append(c)
        elif is_punctuation(c):
            sb.append(c)
    sys.stdout.write(''.join(sb))
    sys.stdout.flush()

if __name__ == "__main__":
    main()

