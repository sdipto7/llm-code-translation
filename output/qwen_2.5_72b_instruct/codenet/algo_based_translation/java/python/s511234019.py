
def main():
    import sys
    import fileinput
    
    input = fileinput.input()
    a = int(next(input).strip())
    b = int(next(input).strip())
    
    if a % 2 == 0 or b % 2 == 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()

