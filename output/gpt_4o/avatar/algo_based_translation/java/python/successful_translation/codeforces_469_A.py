
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    levels = int(data[1])
    arr = [int(data[i + 2]) for i in range(levels)]
    
    level2 = int(data[levels + 2])
    level3 = levels + level2
    arr2 = arr + [int(data[i + levels + 3]) for i in range(level2)]
    
    arr3 = list(range(1, n + 1))
    count = 0

    for i in range(n):
        for x in range(level3):
            if arr3[i] == arr2[x]:
                count += 1
                break

    if count == n:
        print("I become the guy.")
    else:
        print("Oh, my keyboard!")

if __name__ == "__main__":
    main()

