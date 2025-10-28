
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n, k = data[0], data[1]
    logs = data[2:2+n]
    
    low, high = 1, 10**9 + 1000
    
    def is_possible(mid):
        total = 0
        for log in logs:
            total += (log + mid - 1) // mid - 1
            if total > k:
                return False
        return total <= k
    
    while low < high:
        mid = (low + high) // 2
        if is_possible(mid):
            high = mid
        else:
            low = mid + 1
    
    print(low)

if __name__ == "__main__":
    main()

