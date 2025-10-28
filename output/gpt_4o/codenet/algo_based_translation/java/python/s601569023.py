
def main():
    import sys
    input = sys.stdin.read
    num = int(input().strip())
    if num < 1200:
        print("ABC")
    else:
        print("ARC")

if __name__ == "__main__":
    main()

