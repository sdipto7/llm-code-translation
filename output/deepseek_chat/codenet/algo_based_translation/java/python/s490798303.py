def main():
    import sys
    from collections import defaultdict

    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    
    index = 2
    map_dict = defaultdict(list)
    
    for i in range(k):
        d = int(data[index])
        index += 1
        for j in range(d):
            person = int(data[index])
            index += 1
            map_dict[person].append(d)
    
    count = 0
    for i in range(1, n + 1):
        if i not in map_dict:
            count += 1
            
    print(count)

if __name__ == "__main__":
    main()
