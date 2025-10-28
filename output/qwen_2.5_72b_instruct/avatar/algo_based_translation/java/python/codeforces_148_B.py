
import sys

def main():
    import sys
    import math
    from io import StringIO
    
    input_data = sys.stdin.read().strip().split()
    VP = int(input_data[0])
    VD = int(input_data[1])
    T = int(input_data[2])
    F = int(input_data[3])
    C = int(input_data[4])
    
    if VD <= VP:
        print(0)
        return
    
    answer = 0
    start = T
    
    while True:
        x = start * VP / (VD - VP)
        if (start + x) * VP >= C:
            break
        start += 2 * x + F
        answer += 1
    
    print(answer)

if __name__ == "__main__":
    main()

