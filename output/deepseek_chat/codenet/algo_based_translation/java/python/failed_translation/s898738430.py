
import sys

def main():
    n = int(input().strip())
    a = []
    for i in range(n):
        a.append(int(input().strip()))
    ans = 0
    for i in range(1, n-1):
        if a[i] != min(a[i-1], a[i], a[i+1]) and a[i] != max(a[i-1], a[i], a[i+1]):
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()

