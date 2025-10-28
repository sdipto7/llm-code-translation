
import sys

data = list(map(int, sys.stdin.read().split()))
idx = 0
t = data[idx]
idx += 1
for _ in range(t):
    n = data[idx]
    a = data[idx+1]
    b = data[idx+2]
    idx += 3
    
    if n < a:
        print("No")
        continue
    if a == b:
        print("Yes" if n % a == 0 else "No")
        continue
    
    denominator = b - a
    x = b // denominator
    
    if n > x * a:
        print("Yes")
        continue
    
    low, high, ans = 1, x + 1, 1
    while low <= high:
        mid = (low + high) // 2
        if mid * a < n:
            low = mid + 1
        else:
            ans, high = mid, mid - 1
    
    lower_bound = (ans - 1) * b
    upper_bound = ans * a
    print("No" if lower_bound < n < upper_bound else "Yes")

