
import sys
def main():
    try:
        n = int(sys.stdin.readline().strip())
        arr = list(map(int, sys.stdin.readline().strip().split()))
        if n == 0:
            return
    except:
        return
    max_val = float('-inf')
    for i in range(n):
        for j in range(i, n):
            brr = arr[:]
            for k in range(i, j + 1):
                brr[k] = 1 - brr[k]
            count = sum(brr)
            max_val = max(max_val, count)
    if n == 1:
        if arr[0] == 1:
            print(0)
        else:
            print(1)
    else:
        print(max_val)
