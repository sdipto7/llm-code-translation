
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    list_of_numbers = list(map(int, data[1:n+1]))
    
    list_of_numbers.sort()
    c = 1
    
    for number in list_of_numbers:
        if number >= c:
            c += 1
            
    print(c)

if __name__ == '__main__':
    main()

