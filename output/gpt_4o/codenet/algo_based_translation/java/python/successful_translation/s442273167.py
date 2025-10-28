
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    l = [0] * n
    r = [0] * n
    index = 1
    
    for i in range(n):
        l[i] = int(data[index])
        r[i] = int(data[index + 1])
        index += 2
    
    sum_intervals = 0
    for i in range(n):
        sum_intervals += r[i] - l[i] + 1
    
    print(sum_intervals)

if __name__ == "__main__":
    main()

