import sys

class Main:
    def main(self):
        for line in sys.stdin:
            str = line.strip()
            strArr = str.split(",")
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
                elif i < 10:
                    d += l[i]

if __name__ == "__main__":
    Main().main()
