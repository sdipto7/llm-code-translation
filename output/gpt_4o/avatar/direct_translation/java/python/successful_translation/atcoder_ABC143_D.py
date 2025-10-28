
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    L = []
    for i in range(1, N + 1):
        L.append(int(data[i]))
    
    L.sort()
    count = 0
    
    def find(li, from_idx, target):
        low = from_idx
        upp = len(li) - 1
        mid = (low + upp) // 2 if (upp - low + 1) % 2 != 0 else (low + upp) // 2 + 1
        
        if upp - low < 0:
            return 0
        elif li[from_idx] >= target:
            return 0
        elif li[upp] < target:
            return upp - low + 1
        
        while upp - low > 1:
            if li[mid] >= target:
                upp = mid
            else:
                low = mid
            mid = (low + upp) // 2 if (upp - low + 1) % 2 != 0 else (low + upp) // 2 + 1
        
        return low - from_idx + 1
    
    for i in range(N):
        for j in range(i + 1, N):
            a = L[i]
            b = L[j]
            res = find(L, j + 1, a + b)
            count += res
    
    print(count)

main()

