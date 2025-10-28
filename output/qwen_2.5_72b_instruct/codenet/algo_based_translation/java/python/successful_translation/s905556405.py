import sys

def main():
    import sys
    from io import StringIO
    import sys

    numlist = [0] * 5
    k = 0

    for i in range(5):
        numlist[i] = int(input().strip())

    k = int(input().strip())

    if (numlist[4] - numlist[0]) > k:
        print(":(")
    else:
        print("Yay!")

if __name__ == "__main__":
    main()
