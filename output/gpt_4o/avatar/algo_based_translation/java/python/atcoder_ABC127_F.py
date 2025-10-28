
import sys
import heapq

def main():
    input = sys.stdin.read
    data = input().splitlines()
    t = int(data[0])
    
    pqmax = []  # Min-heap for maximum elements
    pqmin = []  # Max-heap for minimum elements (simulated with negative values)
    
    sumMin = 0
    sumMax = 0
    sumb = 0
    min_val = 0
    
    for line in data[1:t+1]:
        s = line.split()
        
        if s[0] == '2':
            ans = min_val * len(pqmin) - sumMin
            ans1 = sumMax - min_val * len(pqmax)
            print(min_val, ans + ans1 + sumb)
        else:
            in_val = int(s[1])
            sumb += int(s[2])
            
            if in_val > min_val:
                heapq.heappush(pqmax, in_val)
                sumMax += in_val
            else:
                heapq.heappush(pqmin, -in_val)
                sumMin += in_val
            
            if len(pqmin) > len(pqmax):
                moved_val = -heapq.heappop(pqmin)
                sumMax += moved_val
                sumMin -= moved_val
                heapq.heappush(pqmax, moved_val)
            
            if len(pqmin) < len(pqmax):
                moved_val = heapq.heappop(pqmax)
                sumMax -= moved_val
                sumMin += moved_val
                heapq.heappush(pqmin, -moved_val)
            
            min_val = -pqmin[0]

if __name__ == "__main__":
    main()

