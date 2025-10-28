
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    h = [int(data[i + 1]) for i in range(n)]
    
    ans = 0
    out = 0
    
    for i in range(len(h)):
        if out < h[i]:
            ans += h[i] - out
            out = h[i]
        else:
            out = h[i]
    
    print(ans)

if __name__ == "__main__":
    main()

