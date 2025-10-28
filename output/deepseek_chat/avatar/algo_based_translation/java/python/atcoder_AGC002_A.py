
import sys

def main():
    data = sys.stdin.read().split()
    a = int(data[0])
    b = int(data[1])
    
    if a > 0:
        print("Positive")
    elif b >= 0:
        print("Zero")
    elif (b - a + 1) % 2 == 0:
        print("Positive")
    else:
        print("Negative")

if __name__ == "__main__":
    main()

