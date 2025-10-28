
import sys

def main():
    import sys
    import string
    
    input = sys.stdin.read().split()
    N = int(input[0])
    c = list(input[1])
    
    for i in range(len(c)):
        c[i] = chr((ord(c[i]) - ord('A') + N) % 26 + ord('A'))
    
    print(''.join(c))

if __name__ == "__main__":
    main()

