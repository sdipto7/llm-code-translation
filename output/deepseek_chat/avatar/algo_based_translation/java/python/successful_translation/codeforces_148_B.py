
import sys

def main():
    data = sys.stdin.read().split()
    VP = float(data[0])
    VD = float(data[1])
    T = float(data[2])
    F = float(data[3])
    C = float(data[4])
    
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

