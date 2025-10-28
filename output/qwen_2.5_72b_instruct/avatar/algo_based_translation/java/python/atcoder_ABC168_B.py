
def main():
    import sys
    K = int(sys.stdin.readline().strip())
    S = sys.stdin.readline().strip()
    if len(S) <= K:
        print(S)
    else:
        print(S[:K] + "...")

if __name__ == "__main__":
    main()

