
import sys

def main():
    input = sys.stdin.read
    data = input().splitlines()
    
    str_values = data[0].split()
    a, b = map(int, data[1].split())
    u = data[2]
    
    if u == str_values[0]:
        print(f"{a - 1} {b}")
    else:
        print(f"{a} {b - 1}")

if __name__ == "__main__":
    main()

