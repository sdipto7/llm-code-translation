
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    for i in range(5):
        if int(data[i]) == 0:
            print(i + 1)
            break

if __name__ == "__main__":
    main()

