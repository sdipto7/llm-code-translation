
import sys

def main():
    N = int(sys.stdin.readline().strip())
    idorder = {}
    for i in range(1, N + 1):
        A = int(sys.stdin.readline().strip())
        idorder[A] = i
    
    output = []
    for i in range(1, N + 1):
        output.append(str(idorder[i]))
    
    print(' '.join(output))

if __name__ == "__main__":
    main()

