
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    h1 = int(data[0])
    m1 = int(data[1])
    h2 = int(data[2])
    m2 = int(data[3])
    k = int(data[4])
    
    t1 = h1 * 60 + m1
    t2 = h2 * 60 + m2
    
    result = t2 - t1 - k
    
    print(result)

if __name__ == "__main__":
    main()

