
import sys

def main():
    tokens = sys.stdin.read().split()
    n = int(tokens[0])
    m = int(tokens[1])
    arrs = tokens[2:2 + n]
    
    return_dex = 0
    lengths = []
    
    for s in arrs:
        dex_g = s.find('G')
        dex_s = s.find('S')
        if dex_g > dex_s:
            return_dex = -1
        lengths.append(dex_s - dex_g)
    
    unique_lengths = set(lengths)
    print(-1 if return_dex == -1 else len(unique_lengths))

if __name__ == "__main__":
    main()

