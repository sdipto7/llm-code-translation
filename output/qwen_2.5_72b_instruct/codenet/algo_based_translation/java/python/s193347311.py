
import sys

def main():
    import sys
    import fileinput
    
    input = fileinput.input()
    intLoop = int(next(input).strip())
    strTaro = ""
    strHana = ""
    intTaro = 0
    intHana = 0

    for _ in range(intLoop):
        strTaro = next(input).strip()
        strHana = next(input).strip()
        intJudge = (strTaro > strHana) - (strTaro < strHana)
        if intJudge < 0:
            intHana += 3
        elif intJudge == 0:
            intTaro += 1
            intHana += 1
        elif intJudge > 0:
            intTaro += 3

    print(intTaro, intHana)

if __name__ == "__main__":
    main()

