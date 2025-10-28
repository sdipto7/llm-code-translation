
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    t = int(data[index])
    index += 1
    results = []
    
    while t > 0:
        n = int(data[index])
        index += 1
        a = int(data[index])
        index += 1
        b = int(data[index])
        index += 1
        
        if n < a:
            results.append("No")
            t -= 1
            continue
        
        if a == b:
            if n % a == 0:
                results.append("Yes")
            else:
                results.append("No")
            t -= 1
            continue

        x = b // (b - a)
        
        if n > x * a:
            results.append("Yes")
            t -= 1
            continue
        
        low = 1
        high = x + 1
        ans = 1
        
        while low <= high:
            mid = (low + high) // 2
            if mid * a < n:
                low = mid + 1
            else:
                ans = mid
                high = mid - 1
        
        if n > (ans - 1) * b and n < ans * a:
            results.append("No")
        else:
            results.append("Yes")
        
        t -= 1

    sys.stdout.write("\n".join(results) + "\n")

if __name__ == "__main__":
    main()

