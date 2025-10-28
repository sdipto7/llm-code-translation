
import sys

def main():
    data = sys.stdin.read().split()
    idx = 0
    t = int(data[idx]); idx += 1
    out_lines = []
    
    for _ in range(t):
        n = int(data[idx]); idx += 1
        a = int(data[idx]); idx += 1
        b = int(data[idx]); idx += 1
        
        if n < a:
            out_lines.append("No")
            continue
            
        if a == b:
            if n % a == 0:
                out_lines.append("Yes")
            else:
                out_lines.append("No")
            continue
            
        x = b // (b - a)
        
        if n > x * a:
            out_lines.append("Yes")
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
            out_lines.append("No")
        else:
            out_lines.append("Yes")
            
    print("\n".join(out_lines))

if __name__ == "__main__":
    main()

