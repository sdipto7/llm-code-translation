
def main():
    import sys
    
    sc = sys.stdin
    numbers = list(map(int, sc.read().split()))
    
    remainder = numbers[0] % 500
    second_integer = numbers[1]
    
    if remainder <= second_integer:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

