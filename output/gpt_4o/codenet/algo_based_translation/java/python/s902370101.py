
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    array = list(map(int, data[1:n+1]))
    
    max_value = 0
    min_value = 10000
    
    for i in range(n):
        if max_value < array[i]:
            max_value = array[i]
        if min_value > array[i]:
            min_value = array[i]
    
    print(max_value - min_value)

if __name__ == "__main__":
    main()

