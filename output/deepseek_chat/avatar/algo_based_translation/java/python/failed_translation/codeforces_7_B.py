
import sys

def main():
    data = sys.stdin.read().split()
    idx = 0
    t = int(data[idx]); idx += 1
    m = int(data[idx]); idx += 1
    memory = [0] * m
    allocIdx = 0
    
    for j in range(t):
        command = data[idx]; idx += 1
        
        if command == "alloc":
            n = int(data[idx]); idx += 1
            length = 0
            canAlloc = False
            start_index = 0
            
            for i in range(m):
                if memory[i] == 0:
                    length += 1
                else:
                    length = 0
                
                if length == n:
                    canAlloc = True
                    start_index = i - n + 1
                    break
            
            if canAlloc:
                allocIdx += 1
                for i in range(start_index, start_index + n):
                    memory[i] = allocIdx
                print(allocIdx)
            else:
                print("NULL")
                
        elif command == "erase":
            x = int(data[idx]); idx += 1
            if x <= 0:
                print("ILLEGAL_ERASE_ARGUMENT")
                continue
            
            hasErased = False
            for i in range(m):
                if memory[i] == x:
                    memory[i] = 0
                    hasErased = True
            
            if not hasErased:
                print("ILLEGAL_ERASE_ARGUMENT")
                
        elif command == "defragment":
            d = 0
            for i in range(m):
                if memory[i] == 0:
                    d += 1
                else:
                    memory[i - d] = memory[i]
            
            for i in range(m - d, m):
                memory[i] = 0
                
        else:
            print("h")

if __name__ == "__main__":
    main()

