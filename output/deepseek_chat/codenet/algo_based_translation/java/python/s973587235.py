
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    minN = int(data[1]) - 1
    index = 2
    
    for i in range(n - 1):
        h = int(data[index])
        index += 1
        if minN == h:
            minN = h
        elif minN == h - 1:
            minN = h - 1
        elif minN < h - 1:
            minN = h - 1
        elif minN > h:
            print("No")
            return
    
    print("Yes")

if __name__ == "__main__":
    main()

