import sys

def main():
    import sys
    import re
    while True:
        try:
            str_input = input().strip()
        except EOFError:
            break
        strArr = str_input.split(',')
        l = [0] * 10
        d = 0
        for i in range(10):
            l[i] = int(strArr[i])
            d += l[i]
        v = [int(strArr[10]), int(strArr[11])]
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
