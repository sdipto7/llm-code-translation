
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:n+2]))
    
    x = [0] * 200010
    
    for i in range(n):
        x[a[i] - 1] += 1
    
    x.sort()
    
    ans = 0
    for i in range(200010 - k):
        ans += x[i]
    
    print(ans)

if __name__ == "__main__":
    main()

