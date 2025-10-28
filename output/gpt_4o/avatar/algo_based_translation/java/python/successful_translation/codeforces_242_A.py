
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    x = int(data[0])
    y = int(data[1])
    a = int(data[2])
    b = int(data[3])

    count = 0
    results = []

    for i in range(a, x + 1):
        for j in range(b, y + 1):
            if i <= j:
                continue
            count += 1
            results.append((i, j))

    print(count)
    for result in results:
        print(result[0], result[1])

if __name__ == "__main__":
    main()

