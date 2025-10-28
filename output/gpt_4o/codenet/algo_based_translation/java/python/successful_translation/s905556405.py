
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    numlist = [int(data[i]) for i in range(5)]
    k = int(data[5])
    
    if (numlist[4] - numlist[0]) > k:
        print(":(")
    else:
        print("Yay!")

if __name__ == "__main__":
    main()

