
import bisect

def main():
    import sys
    n = int(sys.stdin.readline())
    counts = {}
    sorted_keys = []
    for _ in range(n):
        num = int(sys.stdin.readline())
        index = bisect.bisect_left(sorted_keys, num)
        if index > 0:
            key = sorted_keys[index - 1]
            counts[key] -= 1
            if counts[key] == 0:
                del counts[key]
                sorted_keys.pop(index - 1)
            counts[num] = counts.get(num, 0) + 1
            if counts[num] == 1:
                insert_pos = bisect.bisect_left(sorted_keys, num)
                sorted_keys.insert(insert_pos, num)
        else:
            counts[num] = counts.get(num, 0) + 1
            if counts[num] == 1:
                insert_pos = bisect.bisect_left(sorted_keys, num)
                sorted_keys.insert(insert_pos, num)
    print(sum(counts.values()))

if __name__ == "__main__":
    main()

