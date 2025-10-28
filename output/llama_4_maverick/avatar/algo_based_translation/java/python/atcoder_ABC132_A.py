def main():
    s = input().strip()
    targ = list(s)
    freq_map = {}
    for char in targ:
        if char in freq_map:
            freq_map[char] += 1
        else:
            freq_map[char] = 1
    ok = True
    for freq in freq_map.values():
        if freq != 2:
            ok = False
            break
    if ok and len(freq_map) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
