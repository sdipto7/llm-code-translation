import sys

def main():
    for line in sys.stdin:
        str_arr = line.strip().split(',')
        l = [int(x) for x in str_arr[:10]]
        d = sum(l)
        v = [int(str_arr[10]), int(str_arr[11])]
        t = d / (v[0] + v[1])
        d = 0
        for i in range(11):
            if v[0] * t <= d:
                print(i)
                break
            else:
                d += l[i]

if __name__ == "__main__":
    main()
