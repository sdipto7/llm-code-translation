
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    count = int(data[0])
    giving_numbers = [int(data[i + 1]) for i in range(count)]

    for i in range(count - 1, -1, -1):
        print(giving_numbers[i], end=' ')
    
    print()

if __name__ == "__main__":
    main()

