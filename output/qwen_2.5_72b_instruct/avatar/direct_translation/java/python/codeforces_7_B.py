
import sys

input = sys.stdin.read().split()
t = int(input[0])
m = int(input[1])
memory = [0] * m
allocIdx = 0
index = 2

for _ in range(t):
    command = input[index]
    index += 1
    if command == "alloc":
        n = int(input[index])
        index += 1
        len = 0
        canAlloc = False
        for i in range(m):
            if memory[i] == 0:
                len += 1
            else:
                len = 0
            if len == n:
                canAlloc = True
                start = i - n + 1
                break
        if canAlloc:
            allocIdx += 1
            for i in range(start, start + n):
                memory[i] = allocIdx
            print(allocIdx)
        else:
            print("NULL")
    elif command == "erase":
        x = int(input[index])
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

