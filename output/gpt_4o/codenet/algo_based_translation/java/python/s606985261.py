
def main():
    import sys
    input = sys.stdin.read
    s = input().strip()
    total = 0

    for i in range(len(s)):
        for j in range(i + 1, len(s)):
            if s[i] == s[j]:
                total += 1

    if total == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

