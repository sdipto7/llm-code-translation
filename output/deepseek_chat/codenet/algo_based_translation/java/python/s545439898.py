
import sys

def main():
    data = sys.stdin.read().split()
    count = int(data[0])
    giving_numbers = []
    index = 1
    for i in range(count):
        giving_numbers.append(int(data[index]))
        index += 1
    
    output = []
    for i in range(count - 1, -1, -1):
        output.append(str(giving_numbers[i]))
    
    print(" ".join(output))

if __name__ == "__main__":
    main()

