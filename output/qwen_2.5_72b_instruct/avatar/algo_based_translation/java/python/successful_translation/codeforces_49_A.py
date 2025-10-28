
def main():
    import sys
    s = sys.stdin.readline().strip()
    length = len(s)
    ch = ''
    for i in range(length - 1, -1, -1):
        if s[i] != ' ' and s[i] != '?':
            ch = s[i]
            break
    ch = ch.lower()
    if ch in 'aeiouy':
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

