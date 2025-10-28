
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    w = int(data[0])
    h = int(data[1])
    n = int(data[2])
    
    x = [0] * n
    y = [0] * n
    a = [0] * n
    
    xmax = w
    xmin = 0
    ymax = h
    ymin = 0
    
    index = 3
    for i in range(n):
        x[i] = int(data[index])
        y[i] = int(data[index+1])
        a[i] = int(data[index+2])
        
        if a[i] == 1:
            xmin = max(xmin, x[i])
        elif a[i] == 2:
            xmax = min(xmax, x[i])
        elif a[i] == 3:
            ymin = max(ymin, y[i])
        elif a[i] == 4:
            ymax = min(ymax, y[i])
        
        index += 3
    
    w = max(xmax - xmin, 0)
    h = max(ymax - ymin, 0)
    
    print(w * h)

main()

