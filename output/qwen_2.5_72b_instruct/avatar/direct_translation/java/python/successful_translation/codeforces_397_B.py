
import sys

def input():
    return sys.stdin.read().split()

data = input()
index = 0

def next_input():
    global index
    result = data[index]
    index += 1
    return result

t = int(next_input())
for _ in range(t):
    n = int(next_input())
    a = int(next_input())
    b = int(next_input())
    if n < a:
        print("No")
        continue
    if a == b:
        if n % a == 0:
            print("Yes")
        else:
            print("No")
        continue
    x = b // (b - a)
    if n > x * a:
        print("Yes")
        continue
    low = 1
    high = x + 1
    ans = 1
    while low <= high:
        mid = (low + high) // 2
        if mid * a < n:
            low = mid + 1
        else:
            ans = mid
            high = mid - 1
    if n > (ans - 1) * b and n < ans * a:
        print("No")
    else:
        print("Yes")

