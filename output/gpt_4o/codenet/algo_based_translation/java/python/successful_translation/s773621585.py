
def main():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    n = int(data[0])
    
    map_dict = {}
    
    for i in range(1, n + 1):
        map_dict[data[i]] = ""
    
    print(len(map_dict))

if __name__ == "__main__":
    main()

