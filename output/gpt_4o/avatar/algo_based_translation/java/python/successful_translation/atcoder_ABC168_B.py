
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    K = int(data[0])
    S = data[1]
    
    if len(S) <= K:
        print(S)
    else:
        print(S[:K] + "...")

if __name__ == "__main__":
    main()

