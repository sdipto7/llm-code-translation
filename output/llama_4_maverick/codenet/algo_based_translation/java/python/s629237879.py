
import sys

def main():
    n = int(sys.stdin.readline().strip())
    str_list = [sys.stdin.readline().strip() for _ in range(n)]
    mark = ["S", "H", "C", "D"]
    for ma in mark:
        for i in range(1, 14):
            s = str(i)
            st = ma + " " + s
            if st not in str_list:
                print(st)

if __name__ == "__main__":
    main()

