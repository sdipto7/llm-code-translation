
import re

def main():
    import sys
    n = int(input())
    num = [0] * n
    for i in range(n):
        num[i] = i + 1
        
    count = int(input())
    pattern = r"(\d+),(\d+)"
    line = [0, 0]
    
    for _ in range(count):
        input_str = input().strip()
        match = re.match(pattern, input_str)
        if match:
            line[0] = int(match.group(1)) - 1
            line[1] = int(match.group(2)) - 1
            
        change = num[line[0]]
        num[line[0]] = num[line[1]]
        num[line[1]] = change
        
    for i in range(len(num)):
        print(num[i])

if __name__ == "__main__":
    main()

