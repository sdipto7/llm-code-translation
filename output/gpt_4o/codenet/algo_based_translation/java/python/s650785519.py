
def main():
    import sys
    input = sys.stdin.read
    x = int(input().strip())
    ans = (2199 - x) // 200
    print(ans)

if __name__ == "__main__":
    main()

