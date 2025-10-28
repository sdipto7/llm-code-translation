
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    Q = int(data[0])
    H = int(data[1])
    S = int(data[2])
    D = int(data[3])
    N = int(data[4])
    
    onePrice = min(Q * 4, H * 2, S)
    
    if onePrice <= D / 2:
        print(N * onePrice)
    else:
        print((N // 2) * D + (N % 2) * onePrice)

if __name__ == "__main__":
    main()

