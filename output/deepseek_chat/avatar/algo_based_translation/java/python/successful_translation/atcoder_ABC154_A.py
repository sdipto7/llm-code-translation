
import sys

def main():
    input_line1 = sys.stdin.readline().strip().split()
    input_line2 = sys.stdin.readline().strip()
    input_line3 = sys.stdin.readline().strip()
    
    tokens = input_line2.split()
    a = int(tokens[0])
    b = int(tokens[1])
    u = input_line3
    
    if u == input_line1[0]:
        print(f"{a-1} {b}")
    else:
        print(f"{a} {b-1}")

if __name__ == "__main__":
    main()

