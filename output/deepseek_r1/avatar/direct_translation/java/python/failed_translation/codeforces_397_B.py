Here is the Python code translated from the provided Java code:


t = int(input())
for _ in range(t):
    n, a, b = map(int, input().split())
    if n < a:
        print("No")
    elif a == b:
        print("Yes" if n % a == 0 else "No")
    else:
        x = b // (b - a)
        if n > x * a:
            print("Yes")
        else:
            low, high, ans = 1, x + 1, 1
            while low <= high:
                mid = (low + high) // 2
                if mid * a < n:
                    low = mid + 1
                else:
                    ans = mid
                    high = mid - 1
            if (ans - 1) * b < n < ans * a:
                print("No")
            else:
                print("Yes")

