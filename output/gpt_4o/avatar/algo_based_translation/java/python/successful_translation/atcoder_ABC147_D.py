
import sys
import time

def atcoder_ABC147_D():
    startTime = int(round(time.time() * 1000))
    
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    A = list(map(int, data[1:n+1]))
    
    div = int(1e9 + 7)
    ans = 0
    
    for i in range(60):
        a = 0
        count1 = 0
        
        for j in range(n):
            if (A[j] >> i) & 1 == 1:
                count1 += 1
        
        a = count1 * (n - count1)
        
        for j in range(i):
            a = (a << 1) % div
        
        ans = (ans + a) % div
    
    print(ans)
    
    endTime = int(round(time.time() * 1000))

if __name__ == "__main__":
    atcoder_ABC147_D()

