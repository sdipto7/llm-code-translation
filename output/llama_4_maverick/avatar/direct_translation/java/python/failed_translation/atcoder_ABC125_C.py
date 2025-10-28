
import math

def gcd(a, b):
    if b > a:
        a, b = b, a
    if b == 0:
        return a
    r = -1
    while r != 0:
        r = a % b
        a = b
        b = r
    return a

def main():
    N = int(input())
    A = list(map(int, input().split()))
    L = 
