
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    c = list(data[1])
    
    for i in range(len(c)):
        c[i] = chr((ord(c[i]) - ord('A') + N) % 26 + ord('A'))
    
    print(''.join(c))

if __name__ == "__main__":
    main()

