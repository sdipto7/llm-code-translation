
import sys
import math

MOD = 1000000007

def main():
    n = int(sys.stdin.readline())
    l = []
    for i in range(n):
        l.append(int(sys.stdin.readline()))
    
    l.sort()
    result = l[n//2] - l[n//2 - 1]
    print(result)

def print_obj(o):
    print(str(o))

def lcm(m, n):
    return m * n // gcd(m, n)

def gcd(m, n):
    if m < n:
        return gcd(n, m)
    if n == 0:
        return m
    return gcd(n, m % n)

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value
    
    def getKey(self):
        return self.key
    
    def getValue(self):
        return self.value

if __name__ == "__main__":
    main()

