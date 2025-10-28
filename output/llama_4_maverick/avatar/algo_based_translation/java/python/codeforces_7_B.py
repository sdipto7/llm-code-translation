def main():
    t, m = map(int, input().split())
    memory = [0] * m
    allocIdx = 0

    for _ in range(t):
        command = input().strip()
        if command == "alloc":
            n = int(input())
            length = 0
            canAlloc = False
            start_idx = 0
            for i in range(m):
                if memory[i] == 0:
                    length += 1
                else:
                    length = 0
                if length == n:
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
            x = int(input())
            if x <= 0:
                print("ILLEGAL_ERASE_ARGUMENT")
            else:
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
