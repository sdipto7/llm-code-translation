
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    result = 0
    h = []
    g = []
    
    index = 1
    for i in range(n):
        h.append(int(data[index]))
        g.append(int(data[index + 1]))
        index += 2
    
    for i in range(n):
        for j in range(n):
            if h[i] == g[j]:
                result += 1
    
    print(result)

if __name__ == "__main__":
    main()

