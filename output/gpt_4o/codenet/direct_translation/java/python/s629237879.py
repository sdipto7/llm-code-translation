
import sys

def main():
    input = sys.stdin.read
    data = input().splitlines()
    n = int(data[0])
    str_list = data[1:n+1]
    mark = ["S", "H", "C", "D"]
    for ma in mark:
        for i in range(1, 14):
            s = str(i)
            st = f"{ma} {s}"
            if st in str_list:
                continue
            else:
                print(st)

if __name__ == "__main__":
    main()

