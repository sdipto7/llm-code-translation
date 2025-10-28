
def gcd(a, b):
    if b > a:
        a, b = b, a
    if b == 0:
        return a
    while True:
        r = a % b
        if r == 0:
            return b
        a, b = b, r

n = int(input())
a = list(map(int, input().split()))
if n == 1:
    print(a[0])
else:
    L = [0] * n
    L[0] = a[0]
    for i in range(1, n):
        L[i] = gcd(L[i-1], a[i])
    R = [0] * n
    R[-1] = a[-1]
    for i in range(n-2, -1, -1):
        R[i] = gcd(R[i+1], a[i])
    max_gcd = max(L[-2], R[1])
    for i in range(1, n-1):
        current = gcd(L[i-1], R[i+1])
        if current > max_gcd:
            max_gcd = current
