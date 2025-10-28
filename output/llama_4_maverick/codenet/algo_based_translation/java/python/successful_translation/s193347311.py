
import sys

def main():
    intLoop = int(sys.stdin.readline().strip())
    intTaro = 0
    intHana = 0

    for _ in range(intLoop):
        strTaro, strHana = sys.stdin.readline().strip().split()
        intJudge = (strTaro > strHana) - (strTaro < strHana)
        if intJudge < 0:
            intHana += 3
        elif intJudge == 0:
            intTaro += 1
            intHana += 1
        else:
            intTaro += 3

    print(intTaro, intHana)

if __name__ == "__main__":
    main()

