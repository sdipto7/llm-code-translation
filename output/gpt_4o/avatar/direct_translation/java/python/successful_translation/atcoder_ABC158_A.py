
def main():
    import sys
    input = sys.stdin.read
    s = input().strip()
    if 'A' in s and 'B' in s:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

