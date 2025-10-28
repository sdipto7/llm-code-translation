import sys

def main():
    data = sys.stdin.read().split()
    w = int(data[0])
    a = int(data[1])
    b = int(data[2])
    
    difference = max(a, b) - min(a, b) - w
    if difference < 0:
        print(0)
    else:
        print(difference)

if __name__ == "__main__":
    main()
