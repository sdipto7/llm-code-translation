
def main():
    s = input().strip()
    length = len(s)
    ch = None
    for i in range(length - 1, -1, -1):
        if s[i] != ' ' and s[i] != '?':
            ch = s[i]
            break
    ch = ch.lower()
    if ch in ['a', 'e', 'i', 'o', 'u', 'y']:
        print('YES')
    else:
        print('NO')

if __name__ == "__main__":
    main()

