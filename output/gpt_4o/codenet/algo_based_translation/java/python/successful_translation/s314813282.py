
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

def check_war(a, b):
    if a >= b:
        print("War")
    else:
        print("No War")

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().split()
    
    m = int(data[0])
    n = int(data[1])
    x = int(data[2])
    y = int(data[3])
    
    a = [int(data[i]) for i in range(4, 4 + m)]
    b = [int(data[i]) for i in range(4 + m, 4 + m + n)]
    
    x_max = max_int(x, a)
    y_min = min_int(y, b)
    
    check_war(x_max, y_min)

