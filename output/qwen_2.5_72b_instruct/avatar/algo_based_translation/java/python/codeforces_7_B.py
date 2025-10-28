
import sys

def main():
    import sys
    from collections import deque
    
    s = sys.stdin.read().split()
    idx = 0
    
    t = int(s[idx])
    idx += 1
    m = int(s[idx])
    idx += 1
    
    memory = [0] * m
    allocIdx = 0
    
    for _ in range(t):
        command = s[idx]
        idx += 1
        
        if command == "alloc":
            n = int(s[idx])
            idx += 1
            len_count = 0
            can_alloc = False
            
            for i in range(m):
                if memory[i] == 0:
                    len_count += 1
                else:
                    len_count = 0
                
                if len_count == n:
                    can_alloc = True
                    start_idx = i - n + 1
                    break
            
            if can_alloc:
                allocIdx += 1
                for i in range(start_idx, start_idx + n):
                    memory[i] = allocIdx
                print(allocIdx)
            else:
                print("NULL")
        
        elif command == "erase":
            x = int(s[idx])
            idx += 1
            
            if x <= 0:
                print("ILLEGAL_ERASE_ARGUMENT")
                continue
            
            has_erased = False
            
            for i in range(m):
                if memory[i] == x:
                    memory[i] = 0
                    has_erased = True
            
            if not has_erased:
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

