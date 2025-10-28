
import sys

def main():
    import sys
    import math
    sec = int(sys.stdin.readline().strip())
    per_num = int(sys.stdin.readline().strip())
    max_sec = float(sys.stdin.readline().strip()) + 0.5
    ans_num = 0
    i = sec
    while i < max_sec:
        ans_num += per_num
        i += sec
    print(ans_num)

if __name__ == "__main__":
    main()

