
import sys

def atcoder_AGC002_A():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    
    if a > 0:
        print("Positive")
    elif b >= 0:
        print("Zero")
    elif (b - a + 1) % 2 == 0:
        print("Positive")
    else:
        print("Negative")

if __name__ == "__main__":
    atcoder_AGC002_A()

