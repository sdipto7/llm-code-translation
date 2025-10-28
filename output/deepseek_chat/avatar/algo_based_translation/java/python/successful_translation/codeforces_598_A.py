
import math

def main():
    import sys
    data = sys.stdin.read().split()
    idx = 0
    q = int(data[idx])
    idx += 1
    while q > 0:
        n = int(data[idx])
        idx += 1
        s = 0
        if n > 0:
            x = math.floor(math.log(n, 2)) + 1
        else:
            x = 0
        power_val = 2**x
        s = -power_val + 2 + (n * (n + 1)) // 2 - power_val
        print(s)
        q -= 1

if __name__ == "__main__":
    main()

