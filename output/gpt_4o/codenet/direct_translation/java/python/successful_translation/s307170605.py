
def main():
    import sys
    input = sys.stdin.read
    data = list(map(int, input().strip().split()))

    for i in range(5):
        if data[i] == 0:
            print(i+1)
            break

if __name__ == "__main__":
    main()

