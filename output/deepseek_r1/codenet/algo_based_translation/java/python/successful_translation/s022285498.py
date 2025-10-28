
import sys

def main():
    n = int(sys.stdin.readline())
    count = [0] * (n + 1)
    
    for x in range(1, 101):
        for y in range(1, 101):
            for z in range(1, 101):
                val = x*x + y*y + z*z + x*y + x*z + y*z
                if val > n:
                    break
                count[val] += 1
    
    for i in range(1, n + 1):
        print(count[i])

if __name__ == "__main__":
    main()

