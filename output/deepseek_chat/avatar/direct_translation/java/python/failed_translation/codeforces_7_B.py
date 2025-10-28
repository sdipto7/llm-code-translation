
import sys

def main():
    s = sys.stdin
    t = int(s.readline())
    m = int(s.readline())
    memory = [0] * m
    allocIdx = 0
    for _ in range(t):
        parts = s.readline().split()
        if not parts:
            continue
        cmd = parts[0]
        if cmd == "alloc":
            n = int(parts[1])
            length = 0
            canAlloc = False
            for i in range(m):
                if memory[i] == 0:
                    length += 1
                else:
                    length = 0
                if length == n:
                    canAlloc = True
                    length = i - n + 1
                    break
            if canAlloc:
                allocIdx += 1
                for i in range(length, length + n):
                    memory[i] = allocIdx
                print(allocIdx)
            else:
                print("NULL")
        elif cmd == "erase":
            x = int(parts[1])
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
        elif cmd == "defragment":
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

