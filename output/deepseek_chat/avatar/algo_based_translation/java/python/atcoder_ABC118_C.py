
import sys
import collections

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    a = []
    index = 1
    
    if n == 1:
        print(data[index])
        return
        
    for i in range(n):
        a.append(int(data[index]))
        index += 1
        
    a.sort()
    
    if a[-1] == 0:
        print(0)
        return
        
    ans = 0
    while True:
        if len(a) == 1:
            ans = a[0]
            break
        a = func(a)
        
    print(ans)

def func(A):
    a = A.copy()
    min_val = 0
    i = 0
    
    while i < len(a):
        if a[i] == 0:
            a.pop(i)
        else:
            if min_val != 0:
                a[i] = a[i] % min_val
                if a[i] == 1:
                    print(1)
                    sys.exit(0)
                i += 1
            else:
                min_val = a[i]
                i += 1
                
    a.sort()
    return a

if __name__ == "__main__":
    main()

