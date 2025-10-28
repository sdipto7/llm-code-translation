
def codeforces_397_B():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    t = int(data[index])
    index += 1
    results = []

    while t > 0:
        t -= 1
        n = int(data[index])
        a = int(data[index + 1])
        b = int(data[index + 2])
        index += 3
        
        if n < a:
            results.append("No")
            continue
        
        if a == b:
            if n % a == 0:
                results.append("Yes")
            else:
                results.append("No")
            continue
        
        x = b // (b - a)
        
        if n > x * a:
            results.append("Yes")
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
    
    for result in results:
        print(result)

if __name__ == "__main__":
    codeforces_397_B()

