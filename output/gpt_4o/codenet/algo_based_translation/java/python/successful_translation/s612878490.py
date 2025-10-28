
import sys

def main():
    input_data = sys.stdin.read().splitlines()
    first_line = input_data[0]
    
    N, M = map(int, first_line.split())
    
    shortage = []
    
    for i in range(1, M + 1):
        line = input_data[i]
        A = int(line.split()[0])
        if N > A:
            shortage.append(N - A)
        else:
            shortage.append(0)
    
    shortage.sort()
    
    ans = sum(shortage[:M - 1])
    
    print(ans)

if __name__ == "__main__":
    main()

