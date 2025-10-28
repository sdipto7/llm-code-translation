
import sys
import math

def main():
    input = sys.stdin.read
    data = input().split()
    idx = 0
    t = int(data[idx])
    idx += 1
    for _ in range(t):
        n = int(data[idx])
        idx += 1
        a = int(data[idx])
        idx += 1
        b = int(data[idx])
        idx += 1
        if n < a:
            print("No")
            continue
        if a == b:
            if n % a == 0:
                print("Yes")
            else:
                print("No")
            continue
        x = b // (b - a)
        if n > x * a:
            print("Yes")
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
            print("No")
        else:
            print("Yes")

if __name__ == "__main__":
    main()

