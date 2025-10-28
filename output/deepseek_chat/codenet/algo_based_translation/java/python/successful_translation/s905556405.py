def main():
    numlist = [0] * 5
    for i in range(5):
        numlist[i] = int(input())
    k = int(input())
    if (numlist[4] - numlist[0]) > k:
        print(":(")
    else:
        print("Yay!")

if __name__ == "__main__":
    main()
