
t, m = map(int, input().split())
memory = [0] * m
alloc_idx = 0
for _ in range(t):
    parts = input().split()
    cmd = parts[0]
    if cmd == 'alloc':
        n = int(parts[1])
        current_len = 0
        can_alloc = False
        start_idx = -1
        for i in range(m):
            if memory[i] == 0:
                current_len += 1
                if current_len == n:
                    start_idx = i - n + 1
                    can_alloc = True
                    break
            else:
                current_len = 0
        if can_alloc:
            alloc_idx += 1
            for j in range(start_idx, start_idx + n):
                memory[j] = alloc_idx
            print(alloc_idx)
        else:
            print("NULL")
    elif cmd == 'erase':
        x = int(parts[1])
        if x <= 0:
            print("ILLEGAL_ERASE_ARGUMENT")
        else:
            found = False
            for i in range(m):
                if memory[i] == x:
                    memory[i] = 0
                    found = True
            if not found:
                print("ILLEGAL_ERASE_ARGUMENT")
    elif cmd == 'defragment':
        d = 0
        for i in range(m):
            if memory[i] == 0:
                d += 1
            else:
                memory[i - d] = memory[i]
        for i in range(m - d, m):
            memory[i] = 0
    else:
        print('h')

