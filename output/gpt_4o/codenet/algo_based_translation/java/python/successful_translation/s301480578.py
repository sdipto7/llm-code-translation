
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    h = list(map(int, data[1:n+1]))
    
    max_count = 0
    l = 0
    while l < n - 1:
        count = 0
        while l < n - 1 and h[l] >= h[l + 1]:
            l += 1
            count += 1
        max_count = max(max_count, count)
        l += 1

    print(max_count)

if __name__ == "__main__":
    main()

