
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    s = int(data[1])
    max_time = 0
    
    index = 2
    for _ in range(n):
        f = int(data[index])
        t = int(data[index + 1])
        if max_time < f + t:
            max_time = f + t
        index += 2
    
    print(max(max_time, s))

main()

