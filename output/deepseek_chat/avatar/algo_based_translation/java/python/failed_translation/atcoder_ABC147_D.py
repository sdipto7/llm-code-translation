
import sys

def main():
    start_time = sys.time()
    n = int(sys.stdin.readline())
    div = 10**9 + 7
    A = [0] * n
    ans = 0
    data = sys.stdin.read().split()
    for i in range(n):
        A[i] = int(data[i])
    
    for i in range(60):
        a = 0
        count1 = 0
        for j in range(n):
            if (A[j] >> i) & 1:
                count1 += 1
        a = count1 * (n - count1)
        for j in range(i):
            a = (a << 1) % div
        ans = (ans + a) % div
    
    print(ans)
    end_time = sys.time()

if __name__ == "__main__":
    main()

