
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    s = data[0]
    t = data[1]
    a = int(data[2])
    b = int(data[3])
    u = data[4]
    
    if u == s:
        a -= 1
    else:
        b -= 1
    
    print(f"{a} {b}")

if __name__ == "__main__":
    main()

