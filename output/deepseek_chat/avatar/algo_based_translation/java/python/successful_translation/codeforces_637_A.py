
import sys
from collections import defaultdict

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    ara = list(map(int, data[1:1+n]))
    
    freq_map = {}
    for num in ara:
        if num not in freq_map:
            freq_map[num] = 1
        else:
            freq_map[num] += 1
    
    max_freq = 0
    for count in freq_map.values():
        if count > max_freq:
            max_freq = count
    
    current_count = defaultdict(int)
    for num in ara:
        current_count[num] += 1
        if current_count[num] == max_freq:
            print(num)
            break

if __name__ == "__main__":
    main()

