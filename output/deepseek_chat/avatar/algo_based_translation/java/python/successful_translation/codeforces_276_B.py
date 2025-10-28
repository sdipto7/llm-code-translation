
import sys
from collections import defaultdict

def main():
    str_input = sys.stdin.readline().strip()
    freq_map = defaultdict(int)
    odd_count = 0
    
    for char in str_input:
        freq_map[char] += 1
    
    for count in freq_map.values():
        if count % 2 != 0:
            odd_count += 1
    
    if odd_count <= 1 or odd_count % 2 != 0:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()

