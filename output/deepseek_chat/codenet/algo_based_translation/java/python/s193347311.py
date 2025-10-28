
import sys

def main():
    intLoop = int(input().strip())
    strTaro = ""
    strHana = ""
    intTaro = 0
    intHana = 0
    
    for i in range(intLoop):
        strTaro = input().strip()
        strHana = input().strip()
        intJudge = (strTaro > strHana) - (strTaro < strHana)
        if intJudge < 0:
            intHana += 3
        elif intJudge == 0:
            intTaro += 1
            intHana += 1
        elif intJudge > 0:
            intTaro += 3
    
    print(f"{intTaro} {intHana}")

if __name__ == "__main__":
    main()

