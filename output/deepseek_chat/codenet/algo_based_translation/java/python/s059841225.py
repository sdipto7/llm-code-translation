
import sys

def main():
    data = sys.stdin.read().split()
    index = 0
    while index < len(data):
        str_val = data[index]
        str_arr = str_val.split(',')
        l = [0] * 10
        d = 0
        for i in range(10):
            l[i] = int(str_arr[i])
            d += l[i]
        v = [int(str_arr[10]), int(str_arr[11])]
        t = d / (v[0] + v[1])
        d = 0
        for i in range(11):
            if v[0] * t <= d:
                print(i)
                break
            else:
                if i < 10:
                    d += l[i]
        index += 1

if __name__ == "__main__":
    main()

