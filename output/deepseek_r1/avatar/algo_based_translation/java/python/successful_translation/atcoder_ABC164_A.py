
def main():
    scList = []
    while True:
        try:
            line = input()
            scList.append(line)
        except EOFError:
            break
    numlist = scList[0].split()
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])
    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()

