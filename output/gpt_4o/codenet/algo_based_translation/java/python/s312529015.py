
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    A = int(data[0])
    B = int(data[1])
    
    if A % 3 == 0 or B % 3 == 0 or (A + B) % 3 == 0:
        print("Possible")
    else:
        print("Impossible")

if __name__ == "__main__":
    main()

