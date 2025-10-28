
def main():
    import sys

    # Input Operations
    s = sys.stdin.readline().strip()

    # Variable Declarations
    length = len(s)
    ch = '\0'

    # Logic Flow and Control Structures
    for i in range(length - 1, -1, -1):
        if s[i] != ' ' and s[i] != '?':
            ch = s[i]
            break

    # Data Processing
    ch = ch.lower()

    # Output Operations
    if ch in ['a', 'e', 'i', 'o', 'u', 'y']:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

