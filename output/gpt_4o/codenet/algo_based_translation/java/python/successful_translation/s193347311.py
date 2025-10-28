
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    intLoop = int(data[0])
    intTaro = 0
    intHana = 0

    index = 1
    for _ in range(intLoop):
        strTaro = data[index]
        strHana = data[index + 1]
        intJudge = (strTaro > strHana) - (strTaro < strHana)
        
        if intJudge < 0:
            intHana += 3
        elif intJudge == 0:
            intTaro += 1
            intHana += 1
        elif intJudge > 0:
            intTaro += 3
        
        index += 2

    print(intTaro, intHana)

if __name__ == "__main__":
    main()

