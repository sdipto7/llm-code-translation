
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

def main():
    m, n, x, y = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    x_max = max_int(x, a)
    y_min = min_int(y, b)
    check_war(x_max, y_min)

if __name__ == "__main__":
    main()

