
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    k = int(data[1])
    arr = list(map(int, data[2:2+n]))
    
    arr.sort()
    set_values = set()
    count = 0
    
    for value in arr:
        if value % k != 0:
            count += 1
            set_values.add(value)
        elif (value // k) not in set_values:
            count += 1
            set_values.add(value)
    
    print(count)

if __name__ == "__main__":
    main()

