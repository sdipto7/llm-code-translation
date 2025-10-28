
def main():
    import sys
    
    s = sys.stdin
    a = int(s.readline().strip())
    ar = [int(s.readline().strip()) for _ in range(a)]
    
    for i in range(a):
        if i == 0:
            min_diff = ar[i + 1] - ar[i]
        elif i == a - 1:
            min_diff = ar[i] - ar[i - 1]
        else:
            min_diff = min(ar[i] - ar[i - 1], ar[i + 1] - ar[i])
        
        max_diff = max(ar[i] - ar[0], ar[a - 1] - ar[i])
        
        print(min_diff, max_diff)

if __name__ == "__main__":
    main()

