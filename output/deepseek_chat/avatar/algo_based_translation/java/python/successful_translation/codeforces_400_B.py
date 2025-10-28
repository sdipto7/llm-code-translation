
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    arrs = []
    index_ptr = 2
    for i in range(n):
        arrs.append(data[index_ptr])
        index_ptr += 1
    
    length = [0] * n
    index = 0
    returnDex = 0
    
    for tmp in arrs:
        dexG = tmp.find('G')
        dexS = tmp.find('S')
        if dexG > dexS:
            returnDex = -1
        length[index] = dexS - dexG
        index += 1
    
    unique_set = set()
    for len_val in length:
        unique_set.add(len_val)
    
    if returnDex == -1:
        print(returnDex)
    else:
        print(len(unique_set))

if __name__ == "__main__":
    main()

