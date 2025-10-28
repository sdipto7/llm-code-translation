
import sys

def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow_val = power(a)
    max_val = 0
    for j in range(pow_val):
        max_val = max_val * 10 + 9
    return a * (max_val - a)

def main():
    data = sys.stdin.read().split()
    l = int(data[0])
    r = int(data[1])
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = (temp // 2) * (temp - temp // 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        half = temp // 2
        if l <= half <= r:
            res = max(maxxes[i], res)
    print(res)

if __name__ == "__main__":
    main()

