
import sys

def main():
    n = int(input().strip())
    i = 0
    k = 0
    flag = True
    a = [0] * 1000
    
    while k <= n:
        i += k
        while i >= n:
            i -= n
        a[i] += 1
        k += 1
        
    for idx in range(n):
        if a[idx] == 0:
            flag = False
            break
            
    print("YES" if flag else "NO")

if __name__ == "__main__":
    main()

