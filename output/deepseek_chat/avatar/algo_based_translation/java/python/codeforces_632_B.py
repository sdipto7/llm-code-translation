
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().split()))
    s = sys.stdin.readline().strip()
    
    sum_val = 0
    for i in range(len(s)):
        if s[i] == 'B':
            sum_val += a[i]
    
    ans = sum_val
    sum1 = sum_val
    
    for i in range(len(s)):
        if s[i] == 'A':
            sum1 += a[i]
        else:
            sum1 -= a[i]
        if sum1 > ans:
            ans = sum1
    
    sum1 = sum_val
    for i in range(len(s)-1, -1, -1):
        if s[i] == 'A':
            sum1 += a[i]
        else:
            sum1 -= a[i]
        if sum1 > ans:
            ans = sum1
    
    print(ans)

if __name__ == "__main__":
    main()

