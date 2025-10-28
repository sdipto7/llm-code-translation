
import sys

def main():
    data = sys.stdin.read().splitlines()
    n = int(data[0])
    str_arr = data[1:1+n]
    mark = ["S", "H", "C", "D"]
    
    for ma in mark:
        for i in range(1, 14):
            s = str(i)
            st = ma + " " + s
            if st in str_arr:
                continue
            else:
                print(st)

if __name__ == "__main__":
    main()

