
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    ara = data[1:n+1]
    
    frequency = {}
    for num in ara:
        frequency[num] = frequency.get(num, 0) + 1
    
    max_freq = max(frequency.values())
    
    current = {}
    for num in ara:
        current[num] = current.get(num, 0) + 1
        if current[num] == max_freq:
            print(num)
            break

if __name__ == "__main__":
    main()

