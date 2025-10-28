
import sys

def main():
    import sys
    sc = sys.stdin.read().split()
    a = int(sc[0])
    b = sc[1]
    bChar = list(b)
    length = len(bChar)
    bStr = ""
    for i in range(length):
        if bChar[i] != '.':
            bStr += bChar[i]
    bInt = int(bStr)
    result = (a * bInt) // 100
    print(result)

if __name__ == "__main__":
    main()

