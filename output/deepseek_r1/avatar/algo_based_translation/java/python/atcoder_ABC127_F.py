
import sys
import heapq

def main():
    input = sys.stdin.readline
    t = int(input())
    pqmax = []
    pqmin = []
    sum_min = 0
    sum_max = 0
    sumb = 0
    min_val = 0
    
    for _ in range(t):
        parts = input().split()
        if parts[0] == '2':
            ans = min_val * len(pqmin) - sum_min
            ans1 = sum_max - min_val * len(pqmax)
            print(f"{min_val} {ans + ans1 + sumb}")
        else:
            a = int(parts[1])
            b = int(parts[2])
            sumb += b
            
            if a > min_val:
                heapq.heappush(pqmax, a)
                sum_max += a
            else:
                heapq.heappush(pqmin, -a)
                sum_min += a
            
            if len(pqmin) > len(pqmax):
                val = -heapq.heappop(pqmin)
                sum_min -= val
                sum_max += val
                heapq.heappush(pqmax, val)
            
            if len(pqmax) > len(pqmin):
                val = heapq.heappop(pqmax)
                sum_max -= val
                sum_min += val
                heapq.heappush(pqmin, -val)
            
            if pqmin:
                min_val = -pqmin[0]
                
if __name__ == "__main__":
    main()

