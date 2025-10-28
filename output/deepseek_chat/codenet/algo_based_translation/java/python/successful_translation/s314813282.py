import sys

def main():
    data = sys.stdin.read().split()
    m = int(data[0])
    n = int(data[1])
    x = int(data[2])
    y = int(data[3])
    
    a = []
    index = 4
    for i in range(m):
        a.append(int(data[index]))
        index += 1
        
    b = []
    for i in range(n):
        b.append(int(data[index]))
        index += 1
        
    x_max = max_int(x, a)
    y_min = min_int(y, b)
    check_war(x_max, y_min)

def max_int(x, a):
    bignum = x
    for num in a:
        bignum = max(bignum, num)
    return bignum

def min_int(y, b):
    smallnum = y
    for num in b:
        smallnum = min(smallnum, num)
    return smallnum

def check_war(a_val, b_val):
    if a_val >= b_val:
        print("War")
    else:
        print("No War")

if __name__ == "__main__":
    main()
