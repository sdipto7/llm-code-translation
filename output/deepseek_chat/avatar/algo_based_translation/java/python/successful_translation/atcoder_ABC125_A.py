
import sys

def main():
    data = sys.stdin.read().split()
    sec = int(data[0])
    per_num = int(data[1])
    max_sec = float(data[2]) + 0.5
    ans_num = 0
    i = sec
    while i < max_sec:
        ans_num += per_num
        i += sec
    print(ans_num)

if __name__ == "__main__":
    main()

