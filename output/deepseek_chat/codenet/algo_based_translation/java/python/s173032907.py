
import sys
import threading

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    
    cost1 = 0
    cost2 = 0
    current1 = 0
    current2 = 0
    dp1 = [0] * n
    dp2 = [0] * n
    
    j = n - 1
    for i in range(n):
        cost1 += abs(a[i] - current1)
        current1 = a[i]
        dp1[i] = cost1
        
        cost2 += abs(a[j] - current2)
        current2 = a[j]
        dp2[j] = cost2
        j -= 1
    
    for i in range(n):
        if i == 0:
            print(dp2[1] + abs(a[1]))
        elif i == n - 1:
            print(dp1[n-2] + abs(a[n-2]))
        else:
            print(dp1[i-1] + dp2[i+1] + abs(a[i-1] - a[i+1]))

threading.Thread(target=main).start()

