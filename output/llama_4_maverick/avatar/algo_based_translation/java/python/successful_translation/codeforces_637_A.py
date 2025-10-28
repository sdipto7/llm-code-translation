
def main():
    n = int(input())
    ara = list(map(int, input().split()))
    freq_map = {}
    for v in ara:
        if v not in freq_map:
            freq_map[v] = 1
        else:
            freq_map[v] += 1
    max_freq = max(freq_map.values())
    mm = {}
    for v in ara:
        if v not in mm:
            mm[v] = 1
        else:
            mm[v] += 1
        if mm[v] == max_freq:
            print(v)
            break

if __name__ == "__main__":
    main()

