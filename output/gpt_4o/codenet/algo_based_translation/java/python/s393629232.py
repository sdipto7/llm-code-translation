
def calculate_max_difference():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    maxv = float('-inf')
    minv = int(data[1])
    
    for i in range(1, n):
        ri = int(data[i + 1])
        maxv = max(maxv, ri - minv)
        minv = min(minv, ri)
    
    print(maxv)

if __name__ == "__main__":
    calculate_max_difference()

