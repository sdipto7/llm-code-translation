from math import comb

def C(n, m):
    return comb(m, n)

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    p = int(data[1])
    k0 = 0
    k1 = 0
    
    for i in range(2, 2 + n):
        x = int(data[i])
        if x % 2 == 1:
            k1 += 1
        else:
            k0 += 1
    
    ans = 1
    for i in range(k0):
        ans *= 2
    
    if p == 0:
        add = 0
        for i in range(0, k1 + 1, 2):
            add += C(i, k1)
        ans *= add
    else:
        add = 0
        for i in range(1, k1 + 1, 2):
            add += C(i, k1)
        ans *= add
    
    print(ans)

if __name__ == "__main__":
    main()
