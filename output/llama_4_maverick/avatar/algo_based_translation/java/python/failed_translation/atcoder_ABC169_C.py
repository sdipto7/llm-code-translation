
def main():
    a = int(input())
    b = input().strip()
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

