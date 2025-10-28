
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    t = int(data[0])
    count = [0] * (t + 1)
    
    for i in range(2, t + 1):
        num = int(data[i - 1])
        count[num] += 1
    
    for i in range(1, t + 1):
        print(count[i])

if __name__ == "__main__":
    main()

