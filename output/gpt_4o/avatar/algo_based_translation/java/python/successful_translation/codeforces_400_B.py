
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    
    arrs = []
    index = 2
    for _ in range(n):
        arrs.append(data[index])
        index += 1
    
    length = [0] * n
    index = 0
    returnDex = 0
    
    for tmp in arrs:
        dexG = tmp.index("G")
        dexS = tmp.index("S")
        if dexG > dexS:
            returnDex = -1
        length[index] = dexS - dexG
        index += 1
    
    set_of_lengths = set()
    
    for len_val in length:
        set_of_lengths.add(len_val)
    
    if returnDex == -1:
        print(returnDex)
    else:
        print(len(set_of_lengths))

if __name__ == "__main__":
    main()

