
def max_left(n):
    return n - 2 if n > 2 else 0

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    t = int(data[0])
    index = 1
    results = []
    
    for _ in range(t):
        n = int(data[index])
        index += 1
        results.append(max_left(n))
    
    for result in results:
        print(result)

if __name__ == '__main__':
    main()

