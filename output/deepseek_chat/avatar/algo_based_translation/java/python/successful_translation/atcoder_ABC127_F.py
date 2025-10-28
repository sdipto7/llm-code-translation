
import sys
import heapq

def main():
    input = sys.stdin.read().splitlines()
    t = int(input[0])
    index = 1
    pqmax = []
    pqmin = []
    sumMin = 0
    sumMax = 0
    sumb = 0
    min_val = 0
    
    for _ in range(t):
        parts = input[index].split()
        index += 1
        
        if parts[0] == '2':
            ans = min_val * len(pqmin) - sumMin
            ans1 = sumMax - min_val * len(pqmax)
            print(f"{min_val} {ans + ans1 + sumb}")
        else:
            in_val = int(parts[1])
            sumb += int(parts[2])
            
            if in_val > min_val:
                heapq.heappush(pqmax, in_val)
                sumMax += in_val
            else:
                heapq.heappush(pqmin, -in_val)
                sumMin += in_val
            
            if len(pqmin) > len(pqmax):
                top = -heapq.heappop(pqmin)
                sumMin -= top
                heapq.heappush(pqmax, top)
                sumMax += top
            
            if len(pqmin) < len(pqmax):
                top = heapq.heappop(pqmax)
                sumMax -= top
                heapq.heappush(pqmin, -top)
                sumMin += top
            
            if pqmin:
                min_val = -pqmin[0]
            else:
                min_val = pqmax[0]

if __name__ == "__main__":
    main()

