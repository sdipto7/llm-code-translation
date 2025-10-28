
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    t = int(data[0])
    m = int(data[1])
    memory = [0] * m
    allocIdx = 0
    index = 2

    for _ in range(t):
        command = data[index]
        index += 1

        if command == "alloc":
            n = int(data[index])
            index += 1
            len_contiguous = 0
            canAlloc = False
            start_idx = -1

            for i in range(m):
                if memory[i] == 0:
                    len_contiguous += 1
                else:
                    len_contiguous = 0

                if len_contiguous == n:
                    canAlloc = True
                    start_idx = i - n + 1
                    break

            if canAlloc:
                allocIdx += 1
                for i in range(start_idx, start_idx + n):
                    memory[i] = allocIdx
                print(allocIdx)
            else:
                print("NULL")
        
        elif command == "erase":
            x = int(data[index])
            index += 1

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

