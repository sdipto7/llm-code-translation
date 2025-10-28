
import sys

def main():
    sc = sys.stdin
    sec = int(sc.readline().strip())
    per_num = int(sc.readline().strip())
    max_sec = float(int(sc.readline().strip())) + 0.5
    ans_num = 0

    i = sec
    while i < max_sec:
        ans_num += per_num
        i += sec

    print(ans_num)

if __name__ == "__main__":
    main()

