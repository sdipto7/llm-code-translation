
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    
    map = [int(input[i]) for i in range(1, N * 2 + 1)]
    
    map.sort()
    
    max_value = 0
    for i in range(0, N * 2, 2):
        max_value += min(map[i], map[i + 1])
    
    print(max_value)

if __name__ == "__main__":
    main()

