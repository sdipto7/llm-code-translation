
import sys

def main():
    t, m = map(int, sys.stdin.readline().split())
    memory = [0] * m
    alloc_idx = 0

    for _ in range(t):
        parts = sys.stdin.readline().split()
        if not parts:
            continue
        cmd = parts[0]
        if cmd == "alloc":
            n = int(parts[1])
            len_contiguous = 0
            can_alloc = False
            start = -1
            for i in range(m):
                if memory[i] == 0:
                    len_contiguous += 1
                    if len_contiguous == n:
                        can_alloc = True
                        start = i - n + 1
                        break
                else:
                    len_contiguous = 0
            if can_alloc:
                alloc_idx += 1
                for j in range(start, start + n):
                    memory[j] = alloc_idx
                print(alloc_idx)
            else:
                print("NULL")
        elif cmd == "erase":
            x = int(parts[1])
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
        elif cmd == "defragment":
            d = 0
            for i in range(m):
                if memory[i] == 0:
                    d += 1
                else:
                    if d > 0:
                        memory[i - d] = memory[i]
            for i in range(m - d, m):
                memory[i] = 0
        else:
            print("h")

if __name__ == "__main__":
    main()

