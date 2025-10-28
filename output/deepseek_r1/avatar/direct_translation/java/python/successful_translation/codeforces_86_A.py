
def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow_val = power(a)
    max_num = 0
    for _ in range(pow_val):
        max_num = max_num * 10 + 9
    return a * (max_num - a)

l, r = map(int, input().split())
res = 0

maxxes = []
temp = 0
for i in range(10):
    temp = temp * 10 + 9
    half = temp // 2
    product = half * (temp - half)
    maxxes.append(product)

res = max(mult(l), res)
res = max(mult(r), res)

temp = 0
for i in range(10):
    temp = temp * 10 + 9
    half = temp // 2
    if l <= half <= r:
        res = max(maxxes[i], res)

print(res)

